package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class NorthwindTraders4 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Application needs two arguments to run: " +
                    "java com.pluralsight.Main <username> <password>");
            System.exit(1);
        }

        Scanner scanner = new Scanner(System.in);
        String username = args[0];
        String password = args[1];

    }

}
