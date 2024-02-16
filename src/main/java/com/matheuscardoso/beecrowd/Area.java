package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        final double pi = 3.14159;
        double a = Double.parseDouble(input.next());
        double b = Double.parseDouble(input.next());
        double c = Double.parseDouble(input.next());
        System.out.printf("TRIANGULO: %.3f\n", 1.0/2.0 * a * c);
        System.out.printf("CIRCULO: %.3f\n", pi * Math.pow(c, 2));
        System.out.printf("TRAPEZIO: %.3f\n", (a + b) * c / 2);
        System.out.printf("QUADRADO: %.3f\n", Math.pow(b, 2));
        System.out.printf("RETANGULO: %.3f\n", a * b);
    }
}
