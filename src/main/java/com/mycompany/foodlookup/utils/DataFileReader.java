package com.mycompany.foodlookup.utils;

import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class DataFileReader {

    private DataFileReader(){}

    public static List<String[]> read(String fileName){
        List<String[]> itemsList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader(new ClassPathResource(fileName).getFile()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] items = line.split(";");
                itemsList.add(items);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return itemsList;
    }
}
