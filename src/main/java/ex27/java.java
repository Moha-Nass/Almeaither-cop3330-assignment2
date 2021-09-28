package ex27;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
public class java {
    public static void main(String... args) {
    }
    static boolean validateFirstName(String firstname)
    {

        if(firstname.length()>=2)
            return true;
        else
            return false;

    }
    static boolean validateLastName(String lastname)
    {
        if(lastname.length()>=2)
            return true;
        else
            return false;

    }

    static boolean validateZipCode(String zipcode)
    {

        if(zipcode.length()==5 & zipcode.matches(".*[0-9].*"))
            return true;
        else
            return false;
    }



    static boolean validateEmployeeID(String id)
    {
        String s1 = id.substring(0,2);
        String s2 = id.substring(3,7);
        char c = id.charAt(2);

        if(c == '-'  & s1.matches("[a-zA-Z]+")& s2.matches("[0-9]+"))
            return true;
        else
            return false;
    }


    static void checkingAllFunction()
    {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String fn = in.next();

        System.out.print("Enter the last name: ");
        String ln = in.next();

        System.out.print("Enter the ZIP code: ");
        String zc = in.next();

        System.out.print("Enter the employee ID: ");
        String eid = in.next();

        boolean valid_first_name = validateFirstName(fn);
        boolean valid_last_name = validateLastName(ln);
        boolean valid_zip_code = validateZipCode(zc);
        boolean valid_employee_id = validateEmployeeID(eid);




        if(!valid_first_name)
        {
            System.out.print("The first name must be at least character long.");
        }
        if(!valid_last_name)
        {
            System.out.print("The last name must be at least character long.");
        }
        if(!valid_employee_id)
        {
            System.out.print("The employee ID  must be in the formate..");
        }
        if(!valid_zip_code)
        {
            System.out.print("The zipcode must be a 5 digit number.");
        }

        if(valid_first_name & valid_last_name & valid_employee_id & valid_zip_code)
        {
            System.out.println("There were not error found.");
        }



    }


}
