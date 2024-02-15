package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class ExtremelyBasic {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());
        int x = a + b;
        System.out.println("X = " + x);
    }
}
