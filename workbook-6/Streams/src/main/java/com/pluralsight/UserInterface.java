package com.pluralsight;



import java.util.ArrayList;

import java.util.Scanner;

public class UserInterface {

Scanner scanner = new Scanner(System.in);

    public void main(String[] args) {
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
            System.out.println("First Name: " + p.getFirstName() + " Last Name: " + p.getLastName() + " Age: " + p.getAge());
        }

        System.out.println("Enter the First or Last Name of the person you would like to see: ");
        String userNameInput = scanner.nextLine();


    if (userNameInput.equalsIgnoreCase() || userNameInput.equalsIgnoreCase())
        for (Person p : people) {
            System.out.println("First Name: " + p.getFirstName() + " Last Name: " + p.getLastName() + " Age: " + p.getAge());
        }

    }
}
