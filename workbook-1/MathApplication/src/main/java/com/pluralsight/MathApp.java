package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // # 1
        double bobSalary = 90000.00;
        double garySalary = 75000.00;
        double maximumnumber = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is: " + maximumnumber);

        // #2
        double carPrice = 45000;
        double truckPrice = 65000;
        double minimumnumber = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is: " + minimumnumber);

        // #3
        double radius = 7.25;
        double area = (Math.PI * Math.pow(radius, 2));
        System.out.println("The area of the circle is: " + area);

        // #4
        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + squareRoot);

        // #5
        int x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("The distance between the points is: " + distance);

        // #6
        double number2 = -3.8;
        double absoluteNumber2 = Math.abs(number2);
        System.out.println("The absolute value of " + number2 + " is " + absoluteNumber2);

        // #7
        double randomNumber = Math.random();
        System.out.println("The random number between 0 and 1 is " + randomNumber);

    }
}
