package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class SimpleCalculation {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int firstPieceCode = Integer.parseInt(input.next());
        int firstPieceQuantity = Integer.parseInt(input.next());
        double firstPieceValue = Double.parseDouble(input.next());
        int secondPieceCode = Integer.parseInt(input.next());
        int secondPieceQuantity = Integer.parseInt(input.next());
        double secondPieceValue = Double.parseDouble(input.next());
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", (firstPieceValue * firstPieceQuantity) + (secondPieceValue * secondPieceQuantity));
    }
}
