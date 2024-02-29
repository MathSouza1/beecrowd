package com.matheuscardoso.beecrowd;

import java.io.IOException;

public class SequenceIJI {
    public static void main(String[] args) throws IOException {
        int j = 60;
        for (int i=1; j>=0; i+=3){
            System.out.println("I=" + i + " J=" + j);
            j-=5;
        }
    }
}
