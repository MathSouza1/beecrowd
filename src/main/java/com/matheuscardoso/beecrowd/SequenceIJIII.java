package com.matheuscardoso.beecrowd;

import java.io.IOException;

public class SequenceIJIII {
    public static void main(String[] args) throws IOException {
        int j = 7;
        for (int i=1; i<=9; i+=2){
            for (int k=0; k<3; k++) {
                System.out.println("I=" + i + " J=" + j);
                j--;
            }
            j+=5;
        }
    }
}
