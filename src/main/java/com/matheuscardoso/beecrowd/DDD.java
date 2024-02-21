package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class DDD {
    private static final int SIXTY_ONE = 61;
    private static final int SEVENTY_ONE = 71;
    private static final int ELEVEN = 11;
    private static final int TWENTY_ONE = 21;
    private static final int THIRTY_TWO = 32;
    private static final int NINETEEN = 19;
    private static final int TWENTY_SEVEN = 27;
    private static final int THIRTY_ONE = 31;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int ddd = Integer.parseInt(input.nextLine());
        if (ddd == SIXTY_ONE)
            System.out.println("Brasilia");
        else if (ddd == SEVENTY_ONE)
            System.out.println("Salvador");
        else if (ddd == ELEVEN)
            System.out.println("Sao Paulo");
        else if (ddd == TWENTY_ONE)
            System.out.println("Rio de Janeiro");
        else if (ddd == THIRTY_TWO)
            System.out.println("Juiz de Fora");
        else if (ddd == NINETEEN)
            System.out.println("Campinas");
        else if (ddd == TWENTY_SEVEN)
            System.out.println("Vitoria");
        else if (ddd == THIRTY_ONE)
            System.out.println("Belo Horizonte");
        else
            System.out.println("DDD nao cadastrado");
    }
}
