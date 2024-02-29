package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class WeightedAverage {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int numberOfValues = Integer.parseInt(input.nextLine());
        double firstGrade = 0, secondGrade = 0, thirdGrade = 0;
        for (int i=0; i<numberOfValues; i++) {
            firstGrade = Double.parseDouble(input.next());
            secondGrade = Double.parseDouble(input.next());
            thirdGrade = Double.parseDouble(input.next());
            System.out.printf("%.1f\n", (firstGrade*2 + secondGrade*3 + thirdGrade*5) / 10);
        }
    }
}
