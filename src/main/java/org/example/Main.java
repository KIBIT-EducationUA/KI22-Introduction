package org.example;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

import static org.example.TestUtils.plus;

public class Main {
    public static void main(String[] args) {
        int number1;
        int number2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1:");
        number1 = scanner.nextInt();

        System.out.println("Enter operation:");
        String operation = scanner.next();

        System.out.println("Enter number 2:");
        number2 = scanner.nextInt();

        int result;
        if (operation.equals("-")) {
            result = minus(number1, number2);
        } else if (operation.equals("+")) {
            result = plus(number1, number2);
        } else {
            throw new Error("Invalid operation!");
        }

        System.out.println("Result: " + result);

        StringUtils.isAlphanumeric("");
    }

    /**
     * This method sums two ints.
     *
     * @param num1 First int to sum
     * @param num2 Second int to sum
     * @return Sum of two ints
     */


    public static int minus(int num1, int num2) {
        return num1 - num2;
    }
}