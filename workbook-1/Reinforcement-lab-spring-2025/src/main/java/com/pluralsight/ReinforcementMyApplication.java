package com.pluralsight;

import java.util.Scanner;

public class ReinforcementMyApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String userName = scanner.nextLine();


        System.out.println(" ");
        System.out.println("-----------------");
        System.out.println(" ");

        System.out.println("What is your age?: ");
        int age = scanner.nextInt();

        printNameAndAge(userName, age);
        System.out.println("-----------------");
        printVotingEligibility(age);
        System.out.println("-----------------");
        printMessage(userName, age);
        System.out.println("-----------------");
        printWelcomeMessage(userName);
        System.out.println("-----------------");
        printDrinkingEligibility(userName, age);
        System.out.println("-----------------");

        double number = getNumber(scanner);
        double squareRoot = calculateSquareRoot(number);

        System.out.println("The square root of " + number + " is " + squareRoot);
        System.out.println("-----------------");


        int firstNumber = getFirstNumber(scanner);
        int secondNumber = getSecondNumber(scanner);

        boolean isGreaterThan = (firstNumber, secondNumber);
        System.out.println(firstNumber + " is greater than " + secondNumber + "isGreaterThan");

        String welcomeMessage = (userName.equalsIgnoreCase("Eve")) ? "You are not welcome here " + userName + " !" : "Welcome, " + userName + "!";
    }


    public static String getName(Scanner scanner) {
        System.out.println("Enter you name: ");
        String userName = scanner.nextLine();
        return userName;
    }

    public static int getAge(Scanner scanner) {
        System.out.println("Enter Your Age");
        return scanner.nextInt();

    }

    public static void printNameAndAge(String userName, int age) {
        System.out.println("Name: " + userName);
        System.out.println("Age: " + age);
    }

    public static void printVotingEligibility(int age) {
        if (age >= 18) {
            System.out.println("You are old enough to vote! ");
        } else {
            System.out.println("You are not old enough to vote... ");
        }
    }

    public static void printWelcomeMessage(String userName) {
        if (userName.equalsIgnoreCase("Alice")) {
            System.out.println("Welcome Alice!");
        } else {
            System.out.println("Hello Stranger... ");
        }
    }

    public static void printMessage(String name, int age) {
        System.out.println("Hello, " + name + "! you are " + age + " years old.");
    }

    public static void printDrinkingEligibility(String name, int age) {
        if (name.equalsIgnoreCase("Bob") && age >= 21) {
            System.out.println("Hello Bob! You are old enough to drink! ");
        } else {
            System.out.println("Sorry, You are not Bob and not old enough to drink... ");
        }
    }

    public static double getNumber(Scanner scanner) {
        System.out.println("Enter number: ");
        return scanner.nextDouble();
    }

    public static double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }

    public static int getFirstNumber(Scanner scanner) {
        System.out.println("Enter the first number: ");
        return scanner.nextInt();
    }

    public static int getSecondNumber(Scanner scanner) {
        System.out.println("Enter the second number: ");
        return scanner.nextInt();

        public static boolean isGreaterThan(int firstNumber, int secondNumber) {
            return firstNumber > secondNumber;
        }
    }
}



