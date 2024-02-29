package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class RestEqualsTwo {
    private static final int TEN_THOUSAND = 10000;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        for (int i=0; i<=TEN_THOUSAND; i++)
            if (i % number == 2)
                System.out.println(i);
    }
}
