package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class SumConsecutiveOddsII {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        for (int i=0; i < n; i++) {
            int x = Integer.parseInt(input.next());
            int y = Integer.parseInt(input.next());
            verifyTheOddsBetweenTwoNumbersAndPrintThem(x, y);
        }
    }

    private static void verifyTheOddsBetweenTwoNumbersAndPrintThem(int x, int y) {
        int sum = 0, biggest = 0, smallest = 0;
        if (x < y) {
            biggest = y;
            smallest = x;
        } else {
            biggest = x;
            smallest = y;
        }

        for (int i = (smallest + 1); i < biggest; ++i) {
            if (i % 2 != 0)
                sum += i;
        }
        System.out.println(sum);
    }
}
