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

        // Crea un objeto CSVReader
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            // Lee las líneas del archivo CSV
            String[] nextLine;

            // Omitir la primera línea si es el encabezado
            reader.readNext();

            // Leer el archivo línea por línea
            while ((nextLine = reader.readNext()) != null) {
                String username = nextLine[0]; // Columna 1: username
                String password = nextLine[1]; // Columna 2: password
                loginDataList.add(new LoginData(username, password));
                // Crear un objeto LoginData para cada línea y agregarlo a la lista
                //LoginData loginData = new LoginData();
                //loginData.setUsername(username);
                //loginData.setPassword(password);

               // loginDataList.add(loginData);
            }
        }

        return loginDataList;
    }
}
