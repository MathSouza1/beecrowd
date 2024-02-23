package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SecondInterval {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> in = new ArrayList<>();
        ArrayList<Integer> out = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(input.nextLine());
            if (x >= 10 && x <= 20)
                in.add(x);
            else
                out.add(x);
        }
        System.out.println(in.size() + " in");
        System.out.println(out.size() + " out");
    }
}
