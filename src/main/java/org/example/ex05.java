/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        // gather numbers, convert to integers, and calculate results
        String str_num1 = getnum1();
        String str_num2 = getnum2();
        int num1 = Integer.parseInt(str_num1);
        int num2 = Integer.parseInt(str_num2);
        int sum = num1 + num2, dif = num1 - num2, prod = num1 * num2, quot = num1 / num2;

        // print output
        System.out.println(str_num1 + " + " + str_num2 + " = " + sum + "\n" +
                str_num1 + " - " + str_num2 + " = " + dif + "\n" +
                str_num1 + " * " + str_num2 + " = " + prod + "\n" +
                str_num1 + " / " + str_num2 + " = " + quot);
    }

    // gets num1
    public static String getnum1() {

        // prompt for input and return scan
        System.out.print("What is the first number? ");
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    // gets num2
    public static String getnum2() {

        // prompt for input and return scan
        System.out.print("What is the second number? ");
        Scanner input = new Scanner(System.in);
        return input.next();
    }
}
