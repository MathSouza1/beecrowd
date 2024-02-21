package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class TypesOfTriangles {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double a = Double.parseDouble(input.next());
        double b = Double.parseDouble(input.next());
        double c = Double.parseDouble(input.next());
        ArrayList<Double> numbers = sortAndReverseTheNumbers(a, b, c);
        for (int i = 0; i < numbers.size(); i++) {
            if (i == 0) {
                a = numbers.get(i);
            }
            if (i == 1) {
                b = numbers.get(i);
            }
            if (i == 2) {
                c = numbers.get(i);
            }
        }
        if (isATriangle(a, b, c)) {
            if (isRightTriangle(a, b, c))
                System.out.println("TRIANGULO RETANGULO");
            if (isObtusenessTriangle(a, b, c))
                System.out.println("TRIANGULO OBTUSANGULO");
            if (isAcuteAngleTriangle(a, b, c))
                System.out.println("TRIANGULO ACUTANGULO");
            if (isEquilateralTriangle(a, b, c))
                System.out.println("TRIANGULO EQUILATERO");
            else if (isIsoscelesTriangle(a, b, c))
                System.out.println("TRIANGULO ISOSCELES");
        } else {
            System.out.println("NAO FORMA TRIANGULO");
        }
    }

    private static ArrayList<Double> sortAndReverseTheNumbers(double a, double b, double c) {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        numbers.sort(Comparator.reverseOrder());
        return numbers;
    }

    private static boolean isATriangle(double a, double b, double c) {
        return ((b + c) > a);
    }

    private static boolean isRightTriangle(double a, double b, double c) {
        return ((a * a) == (b * b + c * c));
    }

    private static boolean isObtusenessTriangle(double a, double b, double c) {
        return ((a * a) > (b * b + c * c));
    }

    private static boolean isAcuteAngleTriangle(double a, double b, double c) {
        return ((a * a) < (b * b + c * c));
    }

    private static boolean isEquilateralTriangle(double a, double b, double c) {
        return (a == b && b == c && c == a);
    }

    private static boolean isIsoscelesTriangle(double a, double b, double c) {
        return (a == b || b == c || c == a);
    }
}
