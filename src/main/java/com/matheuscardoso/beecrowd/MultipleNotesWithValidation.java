package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class MultipleNotesWithValidation {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double firstGrade = 0;
        double secondGrade = 0;
        while (true) {
            while(true) {
                firstGrade = Double.parseDouble(input.nextLine());
                if (firstGrade < 0 || firstGrade > 10)
                    System.out.println("nota invalida");
                else
                    break;
            }

            while(true) {
                secondGrade = Double.parseDouble(input.nextLine());
                if (secondGrade < 0 || secondGrade > 10)
                    System.out.println("nota invalida");
                else
                    break;
            }

            System.out.printf("media = %.2f\n", (firstGrade + secondGrade) / 2);
            String newCalc = "";
            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                newCalc = input.nextLine();
            } while (!newCalc.equals("1") && !newCalc.equals("2"));

            if (newCalc.equals("2"))
                break;
        }
    }
}
