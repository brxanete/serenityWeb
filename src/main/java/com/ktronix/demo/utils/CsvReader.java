package com.ktronix.demo.utils;



import au.com.bytecode.opencsv.CSVReader;
import com.ktronix.demo.models.models.LoginData;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    public static List<LoginData> readUsersFromCsv(String filePath) throws IOException {
        List<LoginData> loginDataList = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            // Lee las líneas del archivo CSV
            String[] nextLine;

            reader.readNext();

            while ((nextLine = reader.readNext()) != null) {
                String username = nextLine[0]; // Columna 1: username
                String password = nextLine[1]; // Columna 2: password
                loginDataList.add(new LoginData(username, password));

            }
        }

        return loginDataList;
    }
}
