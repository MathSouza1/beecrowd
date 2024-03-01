package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class FixedPassword {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        while (true) {
            String password = input.nextLine();
            if (password.equalsIgnoreCase("2002"))
                break;
            System.out.println("Senha Invalida");
        }
        System.out.println("Acesso Permitido");
    }
}
