package ex29;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */


public class java {
    public static void main(String... args) {
        System.out.println("\nExercise 29");


        String s;
        double r;
        while (true) {
            System.out.print("What is the rate of return? ");
            s = in.next();
            if (!s.matches("[a-zA-Z]+") & !s.equals("0")) {
                break;
            }
            System.out.println("Sorry. That's not a valid input");
        }
        double years;
        if (s.matches("[0-9]+")) {
            r = Double.parseDouble(s);
            years = 72.0 / r;
            System.out.println("It will take " + (int) years + " years to double your investment");
        } else

            System.out.println("Invalid input!");

    }
}
