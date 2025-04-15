package com.pluralsight;

import java.util.Scanner;

public class StaticMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------");
        System.out.println("Rectangle 1: ");
        System.out.println("Enter the length of the rectangle: ");
        int length1 = Scanner.nextInt();

        System.out.println("Enter the width of the rectangle: ");
        int width1 = Scanner.nextInt();

        int area1 = length1 * width1;
        int perimeter1 = (length1 + width1) * 2;

        System.out.println("The length is: " + length1);
        System.out.println("The width is: " + width1);
        System.out.println("The area is: " + area1);
        System.out.println("The perimeter is: " + perimeter1);

        System.out.println("---------------");
        System.out.println("Rectangle 2: ");
        System.out.println("Enter the length of the rectangle: ");
        int length2 = Scanner.nextInt();

        System.out.println("Enter the width of the rectangle: ");
        int width2 = Scanner.nextInt();

        int area2 = length2 * width2;
        int perimeter2 = (length2 + width2) * 2;

        System.out.println("The length is: " + length2);
        System.out.println("The width is: " + width2);
        System.out.println("The area is: " + area2);
        System.out.println("The perimeter is: " + perimeter2);

        System.out.println("---------------");
        System.out.println("Rectangle 2: ");
        System.out.println("Enter the length of the rectangle: ");
        int length3 = Scanner.nextInt();

        System.out.println("Enter the width of the rectangle: ");
        int width3 = Scanner.nextInt();

        int area3 = length3 * width3;
        int perimeter3 = (length3 + width3) * 2;

        System.out.println("The length is: " + length3);
        System.out.println("The width is: " + width3);
        System.out.println("The area is: " + area3);
        System.out.println("The perimeter is: " + perimeter3);

        calculateRectangleInfo(length3, width3);
    }

    public static void calculateRectangleInfo(int length, int width){

    }
}
