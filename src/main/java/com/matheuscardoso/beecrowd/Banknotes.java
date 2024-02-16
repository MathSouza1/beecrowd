package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int value = Integer.parseInt(input.nextLine());
        System.out.println(value);
        System.out.println(value / 100 + " nota(s) de R$ 100,00");
        value %= 100;
        System.out.println(value / 50 + " nota(s) de R$ 50,00");
        value %= 50;
        System.out.println(value / 20 + " nota(s) de R$ 20,00");
        value %= 20;
        System.out.println(value / 10 + " nota(s) de R$ 10,00");
        value %= 10;
        System.out.println(value / 5 + " nota(s) de R$ 5,00");
        value %= 5;
        System.out.println(value / 2 + " nota(s) de R$ 2,00");
        value %= 2;
        System.out.println(value + " nota(s) de R$ 1,00");
        value %= 1;
    }
}
