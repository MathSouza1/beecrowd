package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int numberOfValues = Integer.parseInt(input.nextLine());
        for (int i = 0;i < numberOfValues; i++)
            numbers.add(Integer.parseInt(input.nextLine()));
        for (Integer number : numbers) {
            if (number == 0) {
                System.out.println("NULL");
            } else if (checkIfIsEven(number)) {
                if (number > 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("EVEN NEGATIVE");
                }

            } else if (checkIfIsOdd(number)) {
                if (number > 0) {
                    System.out.println("ODD POSITIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            }
        }
    }

    private static boolean checkIfIsEven(Integer number) {
        return number % 2 == 0;
    }

    private static boolean checkIfIsOdd(Integer number) {
        return number % 2 != 0;
    }
}
