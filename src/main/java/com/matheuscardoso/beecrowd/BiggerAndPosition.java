package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BiggerAndPosition {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int bigger = 0, position = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i=0; i<5; i++)
            numbers.add(Integer.parseInt(input.nextLine()));
        for (int j=0; j<5; j++) {
            if (numbers.get(j) > bigger) {
                bigger = numbers.get(j);
                position = j+1;
            }
        }
        System.out.println(bigger);
        System.out.println(position);
    }
}
