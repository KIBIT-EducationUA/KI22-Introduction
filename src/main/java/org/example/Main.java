package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numbers summarizer v1.0.");
        System.out.println("Summarizer ('+') or subtractor('-') ?");
        String operation = scanner.next();

        for (int i = 0; i < 3; i++) {
            System.out.println("Number 1:");
            int number1 = scanner.nextInt();

            System.out.println("Number 2:");
            int number2 = scanner.nextInt();

            int result;
            if (operation.equals("-")) {
                result = minus(number1, number2);
            } else {
                result = plus(number1, number2);
            }

            System.out.println("Result: " + result + "\n");
        }
    }

    public static int plus(int num1, int num2) {
        return num1 + num2;
    }

    public static int minus(int num1, int num2) {
        return num1 - num2;
    }
}