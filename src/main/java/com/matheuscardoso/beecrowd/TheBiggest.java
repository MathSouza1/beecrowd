package com.matheuscardoso.beecrowd;

import java.util.Scanner;

public class TheBiggest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.next());
        int b = Integer.parseInt(input.next());
        int c = Integer.parseInt(input.next());
        int formula = (a + b + Math.abs(a - b))/2;
        if (formula <= c) {
            formula = c;
        }
        System.out.println(formula + " eh o maior");
    }
}