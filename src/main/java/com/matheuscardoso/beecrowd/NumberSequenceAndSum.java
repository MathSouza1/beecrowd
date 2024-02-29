package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class NumberSequenceAndSum {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        for (int i=0; i<3; i++) {
            int m = Integer.parseInt(input.next());
            int n = Integer.parseInt(input.next());
            if (m > 0 && n > 0) {
                verifyTheNumbersBetweenTwoNumbersAndPrintTheSum(m, n);
            }
        }
    }

    private static void verifyTheNumbersBetweenTwoNumbersAndPrintTheSum(int m, int n) {
        int sum = 0, biggest = 0, smallest = 0;
        if (m < n) {
            biggest = n;
            smallest = m;
        } else {
            biggest = m;
            smallest = n;
        }
        for (int i=smallest; i<=biggest; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("Sum=" + sum);
    }
}
