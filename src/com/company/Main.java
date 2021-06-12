package com.company;

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
