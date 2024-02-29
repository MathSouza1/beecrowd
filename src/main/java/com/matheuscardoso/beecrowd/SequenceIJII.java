package com.matheuscardoso.beecrowd;

import java.io.IOException;

public class SequenceIJII {
    public static void main(String[] args) throws IOException {
        for (int i=1; i<=9; i+=2){
            for (int j=7; j>=5; j--)
                System.out.println("I=" + i + " J=" + j);
        }
    }
}
