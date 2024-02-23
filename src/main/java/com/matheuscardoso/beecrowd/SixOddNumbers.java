package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class SixOddNumbers {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int x = Integer.parseInt(input.nextLine());
        int sum = 0;
        for (int i = 0; sum < 6; i += 2) {
            if (x % 2 != 0) {
                System.out.println(x);
                x += 2;
                sum++;
            } else {
                x++;
            }
        }
    }
}
