package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Class Loaded");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Class Not Loaded");
        }
    }
}