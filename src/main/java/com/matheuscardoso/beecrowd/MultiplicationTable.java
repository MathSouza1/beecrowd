package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        for (int i=1; i<=10; i++)
            System.out.printf("%d x %d = %d\n", i, number, i*number);
    }
}
