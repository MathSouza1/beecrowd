package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class RestOfDivision {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int x = Integer.parseInt(input.nextLine());
        int y = Integer.parseInt(input.nextLine());
        int biggest = 0, smallest = 0;
        if (x > y) {
            biggest = x;
            smallest = y;
        } else if (x < y) {
            biggest = y;
            smallest = x;
        }
        for (int i=smallest+1; i<biggest; i++)
            if (i % 5 == 2 || i % 5 == 3)
                System.out.println(i);
    }
}
