package com.pluralsight;

public class Strings {
    public static void main(String[] args) {
        String s1 = "ABc";
        String s2 = new String("ABC");
        System.out.println("This is s1: " + s1);
        System.out.println("This is s2: " + s2);


        if (s1.equals(s2)) {
            System.out.println("This is true");
        } else {
            System.out.println("This is false");
        }
    }
}
