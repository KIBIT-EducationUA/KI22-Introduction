package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Numbers summarizer v1.0.");
        System.out.println("Enter two numbers:");

        int number1;
        int number2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number 1:");
        number1 = scanner.nextInt();

        System.out.println("Number 2:");
        number2 = scanner.nextInt();

        System.out.println("Result:" + (number1 + number2));
    }
}