package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double firstX = Double.parseDouble(input.next());
        double firstY = Double.parseDouble(input.next());
        double secondX = Double.parseDouble(input.next());
        double secondY = Double.parseDouble(input.next());
        double distance = Math.sqrt(Math.pow(secondX - firstX, 2) + (Math.pow(secondY - firstY, 2)));
        System.out.printf("%.4f\n", distance);
    }
}
