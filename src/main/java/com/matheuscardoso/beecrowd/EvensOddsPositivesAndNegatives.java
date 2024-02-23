package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EvensOddsPositivesAndNegatives {
    public static void main(String[] args) throws IOException {
        ArrayList<Double> numbers = new ArrayList<>();
        int evens = 0, odds = 0, positive = 0, negative = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            numbers.add(Double.parseDouble(input.nextLine()));
        }
        for (Double number : numbers) {
            if (number % 2 != 0)
                evens += 1;
            if (number % 2 == 0)
                odds += 1;
            if (number > 0)
                positive += 1;
            if (number < 0)
                negative += 1;
        }
        System.out.println(odds + " valor(es) par(es)");
        System.out.println(evens + " valor(es) impar(es)");
        System.out.println(positive + " valor(es) positivo(s)");
        System.out.println(negative + " valor(es) negativo(s)");
    }
}
