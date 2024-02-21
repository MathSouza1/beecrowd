package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class CoordinatesOfAPoint {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double x = Double.parseDouble(input.next());
        double y = Double.parseDouble(input.next());
        checkTheCoordinates(x, y);
    }

    private static void checkTheCoordinates(double x, double y) {
        if ( x == 0 && y != 0) {
            System.out.println("Eixo Y");
        } else if (x != 0 && y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if ( x == 0 && y == 0) {
            System.out.println("Origem");
        }
    }
}
