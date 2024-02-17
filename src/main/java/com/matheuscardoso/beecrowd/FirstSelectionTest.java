package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class FirstSelectionTest {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.next());
        int b = Integer.parseInt(input.next());
        int c = Integer.parseInt(input.next());
        int d = Integer.parseInt(input.next());
        if(isValidated(a, b, c, d)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }

    private static boolean isValidated(int a, int b, int c, int d) {
        return b > c && d > a && c + d > a + b && c >= 0 && d >= 0 && a % 2 == 0;
    }
}
