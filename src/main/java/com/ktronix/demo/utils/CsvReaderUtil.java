package com.ktronix.demo.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class CsvReaderUtil {


    public List<Map<String, String>> readCsv(String rutaArchivo) {

        BufferedReader br = null;
        List<Map<String, String>> CsvRows = new ArrayList<>();
        LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<>();
        List<String> data = new ArrayList<>();

        try {

            br =new BufferedReader(new FileReader(rutaArchivo));
            String line = br.readLine();

            while (null!=line) {
                data.add(line);
                line = br.readLine();
            }

            String [] encabezado = data.get(0).split(",");


            for (int d=1 ; d< data.size(); d++) {
                String [] cuerpo = data.get(d).split(",");
                for (int i = 0; i < encabezado.length; i++) {
                    columnMapdata.put(encabezado[i], cuerpo[i]);
                }
                CsvRows.add(columnMapdata);
                columnMapdata = new LinkedHashMap<>();
            }


        } catch (Exception e) {
            e.getCause();
        } finally {
            if (null!=br) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


        return CsvRows;
    }


}