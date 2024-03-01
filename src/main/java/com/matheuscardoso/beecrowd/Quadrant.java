package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(input.next());
            int y = Integer.parseInt(input.next());
            if (x == 0|| y == 0)
                break;
            checkTheCoordinates(x, y);
        }
    }
    private static void checkTheCoordinates(int x, int y) {
        if (x > 0 && y > 0)
            System.out.println("primeiro");
        else if (x < 0 && y > 0)
            System.out.println("segundo");
        else if (x < 0 && y < 0)
            System.out.println("terceiro");
        else if (x > 0 && y < 0)
            System.out.println("quarto");
    }
}
