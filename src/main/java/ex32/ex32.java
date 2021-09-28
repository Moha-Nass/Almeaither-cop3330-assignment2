package ex32;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
public class ex32 {
    public static void main(String... args) {

        System.out.println("\nExercise 32");
        System.out.println("Let's play Fuess the number! \n");
        char playagain = 'y';
        while (playagain == 'Y' || playagain == 'y') {
            System.out.println("Enter the difficult level (1, 2,or 3)");
            int level = in.nextInt();

            int min = 1;
            int max = 0;
            if (level == 1) {
                max = 10;
            }
            if (level == 2) {
                max = 100;
            }
            if (level == 3) {
                max = 1000;

            }

            int rnd_number = (int) ((Math.random() * (max - min)) + min);
            boolean guessed = false;
            System.out.println(rnd_number);
            int counter = 0;

            System.out.println("I have my number. What's you guess?  ");
            while (!guessed) {
                int guessed_number = in.nextInt();
                if (guessed_number == rnd_number) {
                    guessed = true;
                } else if (guessed_number < rnd_number) {
                    System.out.println("To low. Guess again: ");
                    counter++;
                } else {
                    System.out.println("To high. Guess again: ");
                    counter++;
                }
            }

            System.out.println("You got it in " + counter + "guesses!");

            System.out.println("Do you wish to play again? (Y/N)");
            playagain = in.next().charAt(0);
        }

    }
}
