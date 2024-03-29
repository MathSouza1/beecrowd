package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        final double pi = 3.14159;
        double radius = Double.parseDouble(input.nextLine());
        double area = pi * (radius*radius);
        System.out.printf("A=%.4f\n", area);
    }
}
