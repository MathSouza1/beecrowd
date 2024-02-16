package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Consumption {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int x = Integer.parseInt(input.nextLine());
        double y = Double.parseDouble(input.nextLine());
        System.out.printf("%.3f km/l\n", x/y);
    }
}
