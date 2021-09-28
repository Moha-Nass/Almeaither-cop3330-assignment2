package ex25;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

public class java {
    public static void main(String... args) {
    }
        public static void passwordStrength (String pw){
        // Exercise 25
        System.out.println("\nExercise 25");
        String password;
        System.out.print("Enter password: ");
        password = in.nextLine();
        passwordStrength(password);

        {
            if (pw.matches("[0-9]+") & pw.length() < 8) {
                System.out.println("Password is very weak");
            } else if (pw.matches("[a-zA-Z]+") & pw.length() < 8) {
                System.out.println("Password is weak");
            } else if (pw.matches(".*[0-9].*") & pw.length() >= 8 & pw.matches(".*[a-zA-Z].*") & !pw.matches("(?=.*[~!@#$%^&*()_-]).*")) {
                System.out.println("Password is strong");
            } else if (pw.matches(".*[0-9].*") & pw.length() >= 8 & pw.matches(".*[a-zA-Z].*") & pw.matches("(?=.*[~!@#$%^&*()_-]).*")) {
                System.out.println("Password is very strong");
            }


        }
    }
}
