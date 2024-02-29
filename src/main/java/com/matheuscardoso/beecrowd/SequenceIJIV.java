package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Locale;

public class SequenceIJIV {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        float i=0, j=1;
        while (i <= 2.2) {
            if((i>0.0 && i<1.0) || (i>1.0 && i<2.0)) {
                System.out.printf("I=%.1f J=%.1f\n", i, j+i);
                System.out.printf("I=%.1f J=%.1f\n", i, j+1+i);
                System.out.printf("I=%.1f J=%.1f\n", i, j+2+i);
            } else {
                System.out.printf("I=%d J=%d\n", (int) i, (int) j+ (int)i);
                System.out.printf("I=%d J=%d\n", (int) i, (int) j+1+ (int) i);
                System.out.printf("I=%d J=%d\n", (int) i, (int) j+2+ (int) i);
            }
            i+= 0.2F;
        }
    }
}
