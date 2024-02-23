package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class PowerEvens {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        for (int i = 1; i <= n; i++)
            if (i % 2 == 0)
                System.out.println(i + "^" + "2 = " + (int) Math.pow(i, 2));
    }
}
