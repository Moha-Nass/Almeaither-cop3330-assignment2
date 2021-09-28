package ex31;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
public class ex31 {
    public static void main(String... args) {

        System.out.println("\nExercise 31");
        int age, heartRate;
        System.out.print("Enter age: ");
        age = in.nextInt();
        System.out.print("Enter heart rate: ");
        heartRate = in.nextInt();
        double targetHR;

        for (int per = 55; per < 96; per = per + 5) {

            targetHR = (((220 - age) - heartRate) * (double) per / 100) + heartRate;
            System.out.println(per + " \t" + Math.round(targetHR));
        }
    }
}
