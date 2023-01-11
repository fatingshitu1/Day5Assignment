package com.bridgelabz.BasicCore;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number =>");
        int num =scanner.nextInt();
        if (10 % 2 ==0){
            System.out.println("The given number is Even");
        } else {
            System.out.println("The given number is odd");
        }
    }
}
