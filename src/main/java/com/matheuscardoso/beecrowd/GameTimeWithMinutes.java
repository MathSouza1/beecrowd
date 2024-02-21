package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class GameTimeWithMinutes {
    private static final int SIXTY_MINUTES = 60;
    private static final int TWENTY_FOUR_HOURS = 24;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int initialHour = Integer.parseInt(input.next());
        int initialMinute = Integer.parseInt(input.next());
        int finalHour = Integer.parseInt(input.next());
        int finalMinute = Integer.parseInt(input.next());
        int gameTime = ((finalHour * SIXTY_MINUTES) + finalMinute) - ((initialHour * SIXTY_MINUTES) + initialMinute);
        if (gameTime <= 0)
            gameTime += TWENTY_FOUR_HOURS * SIXTY_MINUTES;
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", gameTime/60, gameTime%60);
    }
}
