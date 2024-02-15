package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class SimpleSum {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());
        int sum = a+b;
        System.out.println("SOMA = " + sum);
    }
}
