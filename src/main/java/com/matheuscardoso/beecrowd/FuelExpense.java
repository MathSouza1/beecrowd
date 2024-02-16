package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class FuelExpense {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        final int consumptionOfFuel = 12;
        Scanner input = new Scanner(System.in);
        int hoursOfTravel = Integer.parseInt(input.nextLine());
        int averageSpeed = Integer.parseInt(input.nextLine());
        double distance = averageSpeed * hoursOfTravel;
        System.out.printf("%.3f\n", distance/consumptionOfFuel);
    }
}
