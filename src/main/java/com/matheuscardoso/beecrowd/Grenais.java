package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int interWins = 0, gremioWins = 0, draws = 0, count = 0;
        String result = "Nao houve vencedor";
        while (true) {
            int goalsInter = Integer.parseInt(input.next());
            int goalsGremio = Integer.parseInt(input.next());
            if (goalsInter > goalsGremio)
                interWins += 1;
            else if (goalsGremio > goalsInter)
                gremioWins += 1;
            else
                draws += 1;
            count += 1;
            System.out.println("Novo grenal (1-sim 2-nao)");
            String newGrenal = "";
            newGrenal = input.next();
            if (newGrenal.equals("2"))
                break;
        }

        if (interWins > gremioWins)
            result = "Inter venceu mais";
        else if (gremioWins > interWins)
            result = "Gremio venceu mais";

        System.out.println(count + " grenais");
        System.out.println("Inter:" + interWins);
        System.out.println("Gremio:" + gremioWins);
        System.out.println("Empates:" + draws);
        System.out.println(result);
    }
}
