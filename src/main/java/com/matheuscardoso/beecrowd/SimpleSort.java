package com.matheuscardoso.beecrowd;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleSort {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbersSorted = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        numbers.add(Integer.parseInt(input.next()));
        numbers.add(Integer.parseInt(input.next()));
        numbers.add(Integer.parseInt(input.next()));
        numbersSorted = (ArrayList<Integer>) numbers.clone();
        numbersSorted.sort(Integer::compareTo);
        numbersSorted.forEach(System.out::println);
        System.out.println();
        numbers.forEach(System.out::println);
    }
}
