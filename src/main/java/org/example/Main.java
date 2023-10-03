package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Numbers summarizer v1.0.");
        System.out.println("Enter two numbers:");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number 1:");
        int number1 = scanner.nextInt();

        System.out.println("Which operation is it: '+' or '-' ?");
        String operation = scanner.next();

        System.out.println("Number 2:");
        int number2 = scanner.nextInt();

        int result;
        if (operation.equals("-")) {
            result = minus(number1, number2);
        } else {
            result = plus(number1, number2);
        }

        System.out.println("Result:" + result);
    }

    public static int plus(int num1, int num2) {
        return num1 + num2;
    }

    public static int minus(int num1, int num2) {
        return num1 - num2;
    }
}