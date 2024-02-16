package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int employeeNumber = Integer.parseInt(input.nextLine());
        int workedHours = Integer.parseInt(input.nextLine());
        double amountPerHour = Double.parseDouble(input.nextLine());
        System.out.println("NUMBER = " + employeeNumber);
        System.out.printf("SALARY = U$ %.2f\n", workedHours * amountPerHour);
    }
}
