package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int x = Integer.parseInt(input.nextLine());
        for (int i = 1; i <= x; i += 2)
            System.out.println(i);
    }
}
