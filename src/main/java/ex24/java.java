package ex24;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

class main
{
    public static void main(String... args)
    {
        Scanner in = new Scanner(System.in);


        // Exercise 24
        System.out.println("Exercise 24");
        String s1,s2;
        System.out.println("Enter two string and I will tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        s1 = in.nextLine();

        System.out.print("Enter the second string: ");
        s2 = in.nextLine();

        boolean res = areAnagram(s1,s2);

        if(res)
        {
            System.out.print(s1 + " and "+ s2 + " are anagram.");
        }
        else
        {
            System.out.print(s1 + " and "+ s2 + " are not anagram.");
        }


    }

    private static boolean areAnagram(String s1, String s2) {

        return false;
    }
    }






