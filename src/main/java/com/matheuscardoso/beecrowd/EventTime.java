package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class EventTime {
    private static final int SIXTY_MINUTES = 60;
    private static final int TWENTY_FOUR_HOURS = 24;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String[] day = input.nextLine().split(" ");
        String[] date = input.nextLine().replace(" ", "").split(":");

        int firstDay = Integer.parseInt(day[1]);
        int firstHour = Integer.parseInt(date[0]);
        int firstMinute = Integer.parseInt(date[1]);
        int firstSecond = Integer.parseInt(date[2]);

        day = input.nextLine().split(" ");
        date = input.nextLine().replace(" ", "").split(":");

        int secondDay = Integer.parseInt(day[1]);
        int secondHour = Integer.parseInt(date[0]);
        int secondMinute = Integer.parseInt(date[1]);
        int secondSecond = Integer.parseInt(date[2]);

        firstDay = secondDay - firstDay;
        firstHour = secondHour - firstHour;
        firstMinute = secondMinute - firstMinute;
        firstSecond = secondSecond - firstSecond;

        if (firstSecond < 0) {
            firstSecond += SIXTY_MINUTES;
            firstMinute--;
        }

        if (firstMinute < 0) {
            firstMinute += SIXTY_MINUTES;
            firstHour--;
        }

        if (firstHour < 0) {
            firstHour += TWENTY_FOUR_HOURS;
            firstDay--;
        }
        printData(firstDay, firstHour, firstMinute, firstSecond);
    }

    private static void printData(int firstDay, int firstHour, int firstMinute, int firstSecond) {
        System.out.println(firstDay + " dia(s)");
        System.out.println(firstHour + " hora(s)");
        System.out.println(firstMinute + " minuto(s)");
        System.out.println(firstSecond + " segundo(s)");
    }
}


