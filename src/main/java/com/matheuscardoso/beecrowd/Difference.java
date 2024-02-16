package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Difference {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());
        int c = Integer.parseInt(input.nextLine());
        int d = Integer.parseInt(input.nextLine());
        int difference = ((a * b) - (c * d));
        System.out.println("DIFERENCA = " + difference);
    }
}
