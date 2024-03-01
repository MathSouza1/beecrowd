package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int x, y;
        while(true) {
            x = Integer.parseInt(input.next());
            y = Integer.parseInt(input.next());
            if (x == y) break;

            if (x < y)
                System.out.println("Crescente");
            else
                System.out.println("Decrescente");
        }
    }
}
