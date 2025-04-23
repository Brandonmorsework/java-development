package com.pluralsight;

public class Arrays {
    public static void main(String[] args) {
        int firstNumber = 1;

        int[] listOfNumbers = {34, 23, 65, 434, 5, 86, 9};

        int[] newArrayOfNumbers = new int[6];


        for (int i = 0; i < listOfNumbers.length; i++) {
            System.out.println(listOfNumbers[i]);
        }
    }
}
