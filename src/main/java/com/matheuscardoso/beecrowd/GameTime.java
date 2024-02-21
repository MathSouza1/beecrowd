package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class GameTime {
    private static final int TWENTY_FOUR_HOURS = 24;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int initialTime = Integer.parseInt(input.next());
        int finalTime = Integer.parseInt(input.next());
        int gameTime = 0;
        if (initialTime < finalTime)
            gameTime = initialTime - finalTime;
        else
            gameTime = TWENTY_FOUR_HOURS - initialTime + finalTime;
        System.out.printf("O JOGO DUROU %d HORA(S)\n", Math.abs(gameTime));
    }
}
