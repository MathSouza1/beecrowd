package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Experiences {
    private static final String RABBIT = "C";
    private static final String RAT = "R";
    private static final String FROG = "S";

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int totalOfAnimals = 0;
        double totalOfRabbits = 0, totalOfRats = 0, totalOfFrogs = 0;
        int numberOfAnimals = Integer.parseInt(input.nextLine());
        String[] experiences;
        for (int i = 0; i < numberOfAnimals; i++) {
            experiences = input.nextLine().split(" ");
            if (experiences[1].equalsIgnoreCase(RABBIT))
                totalOfRabbits += Integer.parseInt(experiences[0]);
            if (experiences[1].equalsIgnoreCase(RAT))
                totalOfRats += Integer.parseInt(experiences[0]);
            if (experiences[1].equalsIgnoreCase(FROG))
                totalOfFrogs += Integer.parseInt(experiences[0]);
            totalOfAnimals += Integer.parseInt(experiences[0]);
        }
        printExperiences(totalOfAnimals, totalOfRabbits, totalOfRats, totalOfFrogs);
    }

    private static void printExperiences(int totalOfAnimals, double totalOfRabbits, double totalOfRats, double totalOfFrogs) {
        System.out.printf("Total: " + totalOfAnimals + " cobaias\n");
        System.out.printf("Total de coelhos: %.0f\n", totalOfRabbits);
        System.out.printf("Total de ratos: %.0f\n", totalOfRats);
        System.out.printf("Total de sapos: %.0f\n", totalOfFrogs);
        System.out.printf("Percentual de coelhos: %.2f %c\n", totalOfRabbits/totalOfAnimals * 100, '%');
        System.out.printf("Percentual de ratos: %.2f %c\n", totalOfRats/totalOfAnimals * 100.0, '%');
        System.out.printf("Percentual de sapos: %.2f %c\n", totalOfFrogs/totalOfAnimals * 100.0, '%');
    }
}
