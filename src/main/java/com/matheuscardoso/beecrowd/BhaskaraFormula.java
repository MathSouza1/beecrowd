package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class BhaskaraFormula {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double a = Double.parseDouble(input.next());
        double b = Double.parseDouble(input.next());
        double c = Double.parseDouble(input.next());
        double delta = Math.pow(b, 2) - 4 * a * c;
        double r1 = (-b + Math.sqrt(delta)) / (2 * a);
        double r2 = (-b - Math.sqrt(delta)) / (2 * a);
        if (isInfiniteOrIsNotANumber(r1, r2)) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }
    }

    private static boolean isInfiniteOrIsNotANumber(double r1, double r2) {
        return Double.isNaN(r1) || Double.isInfinite(r1) || Double.isNaN(r2) || Double.isInfinite(r2);
    }
}
