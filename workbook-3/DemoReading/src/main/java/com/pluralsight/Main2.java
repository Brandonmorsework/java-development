package com.pluralsight;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main2 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("goldilocks.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();

        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }
}
