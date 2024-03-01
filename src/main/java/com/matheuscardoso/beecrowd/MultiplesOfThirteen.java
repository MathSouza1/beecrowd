package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class MultiplesOfThirteen {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int x = Integer.parseInt(input.nextLine());
        int y = Integer.parseInt(input.nextLine());
        int biggest = 0, smallest = 0, sum = 0;
        if (x > y) {
            biggest = x;
            smallest = y;
        } else if (x < y) {
            biggest = y;
            smallest = x;
        }

        for (int i=smallest; i<=biggest; i++)
            if (i % 13 != 0)
                sum += i;
        System.out.println(sum);
    }
}
