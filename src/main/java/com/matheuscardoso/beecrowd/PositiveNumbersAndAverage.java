package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class PositiveNumbersAndAverage {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        ArrayList<Double> numbers = new ArrayList<>();
        double sum = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 6; i++){
            numbers.add(Double.parseDouble(input.nextLine()));
        }
        for (int j = 0; j < numbers.size(); j++)
            if (numbers.get(j) < 0)
                numbers.remove(j);
        for (Double number : numbers) sum += number;
        System.out.println(numbers.size() + " valores positivos");
        System.out.printf("%.1f\n", sum/(numbers.size()));
    }
}
