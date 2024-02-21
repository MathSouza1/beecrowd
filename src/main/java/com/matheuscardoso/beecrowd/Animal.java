package com.matheuscardoso.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Animal {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String firstText = input.nextLine();
        String secondText = input.nextLine();
        String thirdText = input.nextLine();
        System.out.println(isVertebrateOrInvertebrate(firstText, secondText, thirdText));
    }

    private static String isVertebrateOrInvertebrate(String firstText, String secondText, String thirdText) {
        if (firstText.equalsIgnoreCase("vertebrado"))
            return isBirdOrMammal(secondText, thirdText);
        else if (firstText.equalsIgnoreCase("invertebrado"))
            return isInsectOrAnnelid(secondText, thirdText);
        return "";
    }

    private static String isBirdOrMammal(String secondText, String thirdText) {
        if (secondText.equalsIgnoreCase("ave"))
            return isCarnivoreOrOmnivorous(thirdText);
        else if (secondText.equalsIgnoreCase("mamifero"))
            return isOmnivorousOrHerbivore(thirdText);
        return "";
    }

    private static String isCarnivoreOrOmnivorous(String thirdText) {
        if (thirdText.equalsIgnoreCase("carnivoro"))
            return "aguia";
        else if (thirdText.equalsIgnoreCase("onivoro"))
            return "pomba";
        return "";
    }

    private static String isOmnivorousOrHerbivore(String thirdText) {
        if (thirdText.equalsIgnoreCase("onivoro"))
            return "homem";
        else if (thirdText.equalsIgnoreCase("herbivoro"))
            return "vaca";
        return "";
    }

    private static String isInsectOrAnnelid(String secondText, String thirdText) {
        if (secondText.equalsIgnoreCase("inseto"))
            return isHematophagousOrHerbivore(thirdText);
        else if (secondText.equalsIgnoreCase("anelideo")) {
            return isHematophagousOrOmnivorous(thirdText);
        }
        return "";
    }

    private static String isHematophagousOrHerbivore(String thirdText) {
        if (thirdText.equalsIgnoreCase("hematofago"))
            return "pulga";
        else if (thirdText.equalsIgnoreCase("herbivoro"))
            return "lagarta";
        return "";
    }

    private static String isHematophagousOrOmnivorous(String thirdText) {
        if (thirdText.equalsIgnoreCase("hematofago"))
            return "sanguessuga";
        else if (thirdText.equalsIgnoreCase("onivoro"))
            return "minhoca";
        return "";
    }
}
