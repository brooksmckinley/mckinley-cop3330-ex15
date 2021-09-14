/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the password? ");
        String password = scan.nextLine();

        if (correctPassword(password)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("I don't know you.");
        }
    }

    public static boolean correctPassword(String password) {
        return password.equals("abc$123");
    }
}