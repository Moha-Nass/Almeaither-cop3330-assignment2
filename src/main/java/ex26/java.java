package ex26;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

public class java {
    public static void main(String... args){

    // Exercise 26
		System.out.println("\nExercise 26");

		System.out.print("What is your balance? ");

        int b = in.nextInt();
		System.out.print("What is the APR on the card? ");
    float APR = in.nextFloat();
    float i = APR / 365;
		System.out.print("What is monthly payment you can make? ");
    float p = in.nextFloat();

    float n = (float) (-(1/30) * Math.log(1 + b / p * (1 - Math.pow((1 - i), 30))) / Math.log(1 + i));

		System.out.print("It will take you 70 months to pay off. ");
}
}
