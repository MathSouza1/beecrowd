package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class AgeInDays {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", n/365, n%365/30, n%365%30);
    }
}
