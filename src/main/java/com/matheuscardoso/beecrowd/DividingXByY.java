package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class DividingXByY {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        for (int i=0; i<n; i++) {
            int x = Integer.parseInt(input.next());
            int y = Integer.parseInt(input.next());
            if (y != 0)
                System.out.printf("%.1f\n", (double) x/ (double) y);
            else
                System.out.println("divisao impossivel");
        }
    }
}
