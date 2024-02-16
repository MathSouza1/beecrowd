package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        System.out.printf("%d:%d:%d", n/3600, n%3600/60, n%60);
    }
}
