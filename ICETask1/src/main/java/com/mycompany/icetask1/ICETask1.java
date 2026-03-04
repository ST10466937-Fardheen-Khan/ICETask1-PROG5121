package com.mycompany.icetask1;

import java.util.Scanner;

public class ICETask1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter second number: ");
        int num2 = input.nextInt();

        if (num1 < num2) {

            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
            }

        } else if (num1 > num2) {

            for (int i = num1; i >= num2; i--) {
                System.out.println(i);
            }

        } else {

            System.out.println("Your number is invalid. Please enter a different number");
        }

        input.close();
    }
}