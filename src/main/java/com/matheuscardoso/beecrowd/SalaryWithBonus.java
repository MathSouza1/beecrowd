package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class SalaryWithBonus {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        String employeeName = input.nextLine();
        double salary = Double.parseDouble(input.nextLine());
        double sellsPerMonth = Double.parseDouble(input.nextLine());
        System.out.printf("TOTAL = R$ %.2f\n", (salary + (sellsPerMonth * 0.15)));
    }
}
