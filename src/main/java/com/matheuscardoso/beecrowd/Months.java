package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Months {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int month = Integer.parseInt(input.nextLine());
        ArrayList<String> months = new ArrayList<>(
                Arrays.asList(
                        "January",
                        "February",
                        "March",
                        "April",
                        "May",
                        "June",
                        "July",
                        "August",
                        "September",
                        "October",
                        "November",
                        "December"));
        System.out.println(months.get(month - 1));
    }
}
