package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ThirdAverage {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double firstNote = Double.parseDouble(input.next());
        double secondNote = Double.parseDouble(input.next());
        double thirdNote = Double.parseDouble(input.next());
        double fourthNote = Double.parseDouble(input.next());
        double average = calculateAverage(firstNote, secondNote, thirdNote, fourthNote);
        double fifthNote = 0;
        if (average >= 5.0 && average <= 6.9){
            fifthNote = Double.parseDouble(input.next());
        }
        System.out.printf("Media: %.1f\n", (int) (average * 100) / 100d);
        if (average >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (average < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if (average >= 5.0 && average <= 6.9) {
            System.out.println("Aluno em exame.");
            System.out.printf("Nota do exame: %.1f\n", fifthNote);
            average = (average + fifthNote) / 2;
            if (average >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else if (average < 5.0) {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", average);
        }
    }

    private static double calculateAverage(double firstNote, double secondNote, double thirdNote, double fourthNote) {
        return ((firstNote * 2.0) + (secondNote * 3.0) + (thirdNote * 4.0) + fourthNote) / 10.0;
    }
}