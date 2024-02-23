package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EvensBetweenFiveNumbers {
    public static void main(String[] args) throws IOException {
        ArrayList<Double> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            numbers.add(Double.parseDouble(input.nextLine()));
        }
        for (int j = 0; j < numbers.size(); j++)
            if (numbers.get(j) % 2 != 0)
                numbers.remove(j);
        System.out.println(numbers.size() + " valores pares");
    }
}
