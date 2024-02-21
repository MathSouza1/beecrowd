package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class SalaryIncrease {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double salary = Double.parseDouble(input.nextLine());
        calculateSalaryReadjustmentAndPercentage(salary);
    }

    private static void calculateSalaryReadjustmentAndPercentage(double salary) {
        double readjustment = 0;
        String percentage = "";
        if (salary <= 400.00 && salary >= 0) {
            readjustment = salary;
            salary += salary * 0.15;
            readjustment = salary - readjustment;
            percentage = "15 %";
        } else if (salary <= 800.00 && salary >= 400.01) {
            readjustment = salary;
            salary += salary * 0.12;
            readjustment = salary - readjustment;
            percentage = "12 %";
        } else if (salary <= 1200.00 && salary >= 800.01) {
            readjustment = salary;
            salary += salary * 0.1;
            readjustment = salary - readjustment;
            percentage = "10 %";
        } else if (salary <= 2000.00 && salary >= 1200.01) {
            readjustment = salary;
            salary += salary * 0.07;
            readjustment = salary - readjustment;
            percentage = "7 %";
        } else if (salary > 2000.00) {
            readjustment = salary;
            salary += salary * 0.04;
            readjustment = salary - readjustment;
            percentage = "4 %";
        }
        printSalaryReadjustmentAndPercentage(salary, readjustment, percentage);
    }

    private static void printSalaryReadjustmentAndPercentage(double salary, double readjustment, String percentage) {
        System.out.printf("Novo salario: %.2f\n", salary);
        System.out.printf("Reajuste ganho: %.2f\n", readjustment);
        System.out.printf("Em percentual: %s\n", percentage);
    }
}