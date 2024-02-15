package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        final double n = 3.14159;
        double lightning = Double.parseDouble(input.nextLine());
        double area = n * (lightning*lightning);
        System.out.printf("A=%.4f\n", area);
    }
}
