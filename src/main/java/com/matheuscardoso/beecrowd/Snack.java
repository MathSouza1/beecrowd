package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Snack {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int snackCode = Integer.parseInt(input.next());
        int snackQuantity = Integer.parseInt(input.next());
        double totalPrice = checkTheSnackCodeAndQuantity(snackCode, snackQuantity);
        System.out.printf("Total: R$ %.2f\n", totalPrice);
    }

    private static double checkTheSnackCodeAndQuantity(int code, int quantity) {
        if (code == 1) {
            return 4.00 * quantity;
        } else if (code == 2){
            return 4.50 * quantity;
        } else if (code == 3) {
            return 5.00 * quantity;
        } else if (code == 4) {
            return 2.00 * quantity;
        } else if (code == 5) {
            return 1.50 * quantity;
        }
        return 0;
    }
}

