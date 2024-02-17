package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class BanknotesAndCoins {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double value = Double.parseDouble(input.nextLine());
        System.out.println("NOTAS:");
        System.out.println((int) value / 100 + " nota(s) de R$ 100.00");
        value %= 100;
        System.out.println((int) value / 50 + " nota(s) de R$ 50.00");
        value %= 50;
        System.out.println((int) value / 20 + " nota(s) de R$ 20.00");
        value %= 20;
        System.out.println((int) value / 10 + " nota(s) de R$ 10.00");
        value %= 10;
        System.out.println((int) value / 5 + " nota(s) de R$ 5.00");
        value %= 5;
        System.out.println((int) value / 2 + " nota(s) de R$ 2.00");
        value %= 2;
        value *= 100;
        System.out.println("MOEDAS:");
        System.out.println((int) value / 100 + " moeda(s) de R$ 1.00");
        value %= 100;
        System.out.println((int) value / 50 + " moeda(s) de R$ 0.50");
        value %= 50;
        System.out.println((int) value / 25 + " moeda(s) de R$ 0.25");
        value %= 25;
        System.out.println((int) value / 10+ " moeda(s) de R$ 0.10");
        value %= 10;
        System.out.println((int) value / 5 + " moeda(s) de R$ 0.05");
        value %= 5;
        System.out.println((int) value + " moeda(s) de R$ 0.01");
    }
}
