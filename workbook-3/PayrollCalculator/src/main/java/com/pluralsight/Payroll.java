package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class Payroll {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(id, name, hoursWorked, payRate);

                System.out.printf("Employee ID: %d Name: %s, Gross Pay: $.2f%n", employee.getEmployeeId(), employee.getName(), employee.getGrossPay());

            }

            bufferedReader.close();

        } catch (Exception e) {
            System.err.println("An error has occurred!");
        }
    }
}

