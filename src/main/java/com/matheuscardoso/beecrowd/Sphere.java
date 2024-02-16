package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int radius = Integer.parseInt(input.nextLine());
        final double pi = 3.14159;
        double volume = (4.0/3.0) * pi * Math.pow(radius, 3);
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
