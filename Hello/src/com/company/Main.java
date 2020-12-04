package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Hello = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = Hello.nextLine();
        System.out.println("Hello, "+ name +"!");
    }
}
