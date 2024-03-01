package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class TypesOfFuel {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int alcohol = 0, gasoline = 0, diesel = 0;
        while (true) {
            int fuel = Integer.parseInt(input.nextLine());
            if (fuel == 1)
                alcohol += 1;
            else if (fuel == 2)
                gasoline += 1;
            else if (fuel == 3)
                diesel += 1;
            else if (fuel == 4)
                break;
        }
        printData(alcohol, gasoline, diesel);
    }

    private static void printData(int alcohol, int gasoline, int diesel) {
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcohol);
        System.out.println("Gasolina: " + gasoline);
        System.out.println("Diesel: " + diesel);
    }
}
