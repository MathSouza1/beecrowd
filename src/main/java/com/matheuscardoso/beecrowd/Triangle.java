package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double a = Double.parseDouble(input.next());
        double b = Double.parseDouble(input.next());
        double c = Double.parseDouble(input.next());
        if (checkIfIsATriangle(a, b, c)) {
            calculateAndPrintTriangleArea(a, b, c);
        } else {
            calculateAndPrintTrapezoidArea(a, b , c);
        }
    }

    private static boolean checkIfIsATriangle(double a, double b, double c) {
        return ((a + b > c) && (a + c > b) && (b + c > a));
    }

    private static void calculateAndPrintTriangleArea(double a, double b, double c) {
        System.out.printf("Perimetro = %.1f\n", (a + b + c));
    }

    private static void calculateAndPrintTrapezoidArea(double a, double b, double c) {
        System.out.printf("Area = %.1f\n", ((a + b) * c)/2);
    }
}
