package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int distance = Integer.parseInt(input.nextLine());
        System.out.println(distance * 2 + " minutos");
    }
}
