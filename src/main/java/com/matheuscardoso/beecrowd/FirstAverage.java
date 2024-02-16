package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class FirstAverage {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double a = Double.parseDouble(input.nextLine());
        double b = Double.parseDouble(input.nextLine());
        double average = ((a*3.5) + (b*7.5))/11;
        System.out.printf("MEDIA = %.5f\n", average);
    }
}
