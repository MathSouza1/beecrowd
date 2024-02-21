package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double salary = Double.parseDouble(input.nextLine());
        if (salary >= 0 && salary <= 2000.00)
            System.out.println("Isento");
        else if (salary >= 2000.01 && salary <= 3000.00)
            System.out.printf("R$ %.2f\n", (salary - 2000) * 0.08);
        else if (salary >= 3000.01 && salary <= 4500.00)
            System.out.printf("R$ %.2f\n", (salary - 3000) * 0.18 + 1000.00 * 0.08);
        else
            System.out.printf("R$ %.2f\n", (salary - 4500) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08);
    }
}
