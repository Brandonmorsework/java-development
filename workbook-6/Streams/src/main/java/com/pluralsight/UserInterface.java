package com.pluralsight;



import java.util.ArrayList;

import java.util.Scanner;

public class UserInterface {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        names.add("Brandon Morse 26");
        names.add("Jaden Morris-Law 22" );
        names.add("Durante Thorton 23" );
        names.add("Julianna Vaccaro 24" );
        names.add("Jacob Nealy 25");
        names.add("Emanuel Galloway 23" );
        names.add("Nikiya Bing 22" );
        names.add("Adam Jessie 25" );
        names.add("Sharad Patel 24" );
        names.add("Amena Nazari 22" );

        ArrayList<Person> people = new ArrayList<>();

        for(String fullName : names) {

            String[] parts = fullName.split(" ", 3);
            String firstName = parts[0];
            String lastName = parts[1];
            int age = Integer.parseInt(parts[2]);

            Person person = new Person(firstName, lastName, age);
            people.add(person);
        }

        System.out.println(" ");
        System.out.println("Here are the Available List of Names: ");
        System.out.println(" ");

        for (Person p : people) {
            System.out.println("First Name: " + p.getFirstName() + " Last Name: " + p.getLastName());
        }

        System.out.println("Enter the First or Last Name of the person you would like to see the age for: ");
        String userNameInput = scanner.nextLine();

        boolean found = false;
        for (Person p : people) {
            if (p.getFirstName().equalsIgnoreCase(userNameInput) || p.getLastName().equalsIgnoreCase(userNameInput)) {
                System.out.println("First Name: " + p.getFirstName() + " Last Name: " + p.getLastName() + " Age: " + p.getAge());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No match found...");
        }
    }
}
