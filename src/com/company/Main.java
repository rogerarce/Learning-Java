package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    // Primitive Type;
        int a = 10;
        int b = a;
        a = 100;

        System.out.println("a = " + a + ", b = " + b);

        // Reference Type;
        Person alex = new Person("Alex");
        Person mariam = alex;

        System.out.println("Alex: " + alex.name);
        System.out.println("Mariam: " + mariam.name);

        mariam.name = "Mariam";
        System.out.println("Mariam: " + mariam.name);

        // String Class
        String name = new String("Sean Roger Arce");
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        String lastName = new String("Arce");
        System.out.println(name.contains(lastName));
        System.out.println(name.equals(lastName));

        // Import & Package
        Date date = new Date();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(localDate);
        System.out.println(localDateTime);

        // Arithmetic Operations
        int firstNumber = 100;
        int secondNumber = 10;
        int thirdNumber = 50;
        System.out.println(firstNumber + secondNumber); // Addition
        System.out.println(firstNumber - secondNumber); // Subtraction
        System.out.println(firstNumber * secondNumber); // Multiplication
        System.out.println(firstNumber / secondNumber); // Division
        System.out.println(firstNumber % secondNumber); // Modulo

        // Arithmetic Precedence (bodmas)
        System.out.println(firstNumber-++thirdNumber); // = firstNumber - (++thirdNumber)
        System.out.println(firstNumber * secondNumber + 100); // = (firstNumber * secondNumber) + 100;
        System.out.println(firstNumber / secondNumber * 100); // = (firstNumber / secondNumber) * 100;

        // Math Class
        System.out.println(Math.abs(-10.10)); // negative to positive number
        System.out.println(Math.random());
        System.out.println(Math.addExact(10, 20)); // throws overflow error
        System.out.println(Math.max(10, 1003)); // return largest between two numbers;

        // Comparison Operator, Boolean Expressions
        int personOneAge = 20;
        int personTwoAge = 30;
        System.out.println(personOneAge > personTwoAge); // Greater than
        System.out.println(personOneAge < personTwoAge); // Less than
        System.out.println(personOneAge >= personTwoAge); // Greater than or equal
        System.out.println(personOneAge <= personTwoAge); // Less than or equal
        System.out.println(personOneAge == personTwoAge); // Equals
        System.out.println(personOneAge != personTwoAge); // ! Equals

        // Logical Operators
        boolean isRobot = false;
        boolean isAuthenticated = false;
        boolean isPerson = true;
        System.out.println(isRobot && isAuthenticated); // checks if both expression are true
        System.out.println(isRobot || isAuthenticated); // check if either one of the expression is true
        System.out.println(!isRobot); // Check if not true
        System.out.println((isRobot && isAuthenticated) || isPerson); // combination of logical operators

        // Control Flow
        int age = 18;
        if (age >= 18) {
            System.out.println("Person is an adult"); // Evaluated if age greater than or equal to 18
        } else if (age >= 16 && age < 18) {
            System.out.println("Person is almost an adult"); // Evaluated if age is 16 or 17
        } else {
            System.out.println("Person is not syet an adult"); // Evaluated if age is less than 16
        }

        // Ternary Operator
        String message = isRobot ? "I'm a robot!" : "I'm a human being!";
        System.out.println(message);
    }

    public static class Person
    {
        String name;

        public Person(String name)
        {
            this.name = name;
        }
    }
}
