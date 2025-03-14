package com.ktronix.demo.utils;

import com.google.common.base.Charsets;
import com.ibm.icu.impl.InvalidFormatException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class FeatureWritingUtil {
	
	static final Logger logger = LoggerFactory.getLogger(FeatureWritingUtil.class);	
        
	private FeatureWritingUtil() {
    	
		throw new IllegalStateException("EscrituraFeature");
	}

	private static List<String> writeDataExcelFeature(File featureFile) throws InvalidFormatException, IOException {

		List<String> fileData = new ArrayList<>();

		try (BufferedReader buffReader = new BufferedReader( new InputStreamReader(new BufferedInputStream(new FileInputStream(featureFile)), Charsets.UTF_8))) {

			String data;
			boolean featureData = false;

			while ((data = buffReader.readLine()) != null) {
				if (data.trim().contains("##@externaldata")) {
					fileData = configureDataCsv(data,fileData);
					featureData = true;
				}else {
					if(data.startsWith("|")||data.endsWith("|")){
						if(!featureData){
							fileData.add(data);
						}
					}else {
						fileData.add(data);
						featureData = false;
					}
				}
			}
		}

		return fileData;
	}


	private static List<String> configureDataCsv(String data, List<String> fileData) throws InvalidFormatException, IOException{
        	
		String csvFilePath = data.split("@")[2];
		fileData.add(data);
		return iteractionArraysData(new CsvReaderUtil().readCsv(csvFilePath) , fileData);
	} 

	private static List<File> listFilesFeature(File folder) {

		List<File> featureFiles = new ArrayList<>();

		for (File fileEntry : folder.listFiles()) {
			if (fileEntry.isDirectory()) {
				featureFiles.addAll(listFilesFeature(fileEntry));
			}else {
				if (fileEntry.isFile() && fileEntry.getName().endsWith(".feature")) {
					featureFiles.add(fileEntry);
				}
			}
		}

		return featureFiles;
	} 

	public static void overwriteFilesFeature(String featuresDirectoryPath) throws IOException, InvalidFormatException {

		List<File> listOfFeatureFiles = listFilesFeature(new File(featuresDirectoryPath));

		for (File featureFile : listOfFeatureFiles) {
			if(!featureFile.setWritable(true)) {
				logger.info("No escribe el feature {} " , featureFile );
			}
            	   
			List<String> featureWithExcelData = writeDataExcelFeature(featureFile);

			try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(featureFile), Charsets.UTF_8));) {
				for (String string : featureWithExcelData) {
					writer.write(string);
					writer.write("\n");
				}
			}
		}
	} 

	private static List<String> iteractionArraysData(List<Map<String, String>> excelData, List<String> fileData) {
		
		try {
			
			int cont = 1;
			boolean flag = true;
			for (int rowNumber = 0; rowNumber < excelData.size(); rowNumber++) {

				StringBuilder cellData = new StringBuilder();
                       
				for (Entry<String, String> mapData : excelData.get(rowNumber).entrySet()) {
					/*if(mapData.getValue().equalsIgnoreCase(String.valueOf(cont))) {*/
					cellData.append("|" + mapData.getValue());
					cont++;
/*                	} else if(mapData.getValue().isBlank()) {
                		flag = false;
                	}*/
				}
                
				if(flag) {
					fileData.add(cellData.toString() + "|");
				} else {
					break;
				}
			}
        	
			logger.info("Escritura correcta del feature");
        	
		}catch(Exception e) {			
			e.getCause();
		}

		return fileData;
	}
}