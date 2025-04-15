package com.pluralsight;

public class ReturnPractice {
    public static void main(String[] args) {


    printCrazyMessage();
    int sum = add(5,6);
}
    public static void printCrazyMessage() {
        System.out.println("This is our first Method!");
    }
    public static int add(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }
}
