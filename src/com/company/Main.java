package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        writeInitHelpText();
        Scanner sc = new Scanner(System.in);
        String eingabe = sc.nextLine();
        operateCommand(eingabe, sc);
    }

    private static void writeInitHelpText() {
        System.out.print("(C) xXSteamBroXx 2018");
        System.out.print( System.lineSeparator());
        System.out.print("[0]: h to Shrek; [1]: Shrek to h; [2]: Days to Shrek; [3]: Shrek to Days; [shrexit]: Beenden; ");


    }

    private static void operateCommand(String eingabe, Scanner sc) throws IOException {

        switch (eingabe) {
            case "0":
                double zahl1, zahl2, ergebnis, ergebnis1, total;
                System.out.println("How many hour(s) do you want in Shrek(s)?");
                zahl1 = sc.nextDouble();
                sc.nextLine();
                ergebnis = zahl1 / 1.5;
                System.out.println(zahl1 + " hour(s) are "+ ergebnis + " Shrek(s)!");
                System.out.print( System.lineSeparator());
                repeatCommandWithInfoText(sc);
                break;

            case "1":
                System.out.println("How many Shrek(s) do you want in hour(s)?");
                zahl1 = sc.nextDouble();
                ergebnis = zahl1 * 1.5;
                sc.nextLine();
                System.out.println(zahl1 + " Shrek(s) are "+ ergebnis + " hour(s)!");
                System.out.print( System.lineSeparator());
                repeatCommandWithInfoText(sc);
                break;

            case "2":
                System.out.println("How many day(s) would you like in Shrek(s)");
                zahl1 = sc.nextDouble();
                sc.nextLine();
                System.out.println("And how many hour(s)");
                zahl2 = sc.nextDouble();
                sc.nextLine();
                ergebnis = (zahl1 * 24) / 1.5;
                ergebnis1 = zahl2 / 1.5;
                total = ergebnis + ergebnis1;
                System.out.println(zahl1 + " day(s) and " + zahl2 + " hour(s) are "+ total + " Shrek(s)!");
                System.out.print( System.lineSeparator());
                repeatCommandWithInfoText(sc);
                break;

            case "3":
                System.out.println("How many shrek(s) do you want in day(s)?");
                zahl1 = sc.nextDouble();
                sc.nextLine();
                ergebnis = (zahl1 * 1.5) / 24 ;
                System.out.println(zahl1 + " Shrek(s) are "+ ergebnis + " day(s)!");
                System.out.print( System.lineSeparator());
                repeatCommandWithInfoText(sc);
                break;

            case "wunk":
                System.out.println("Hello Wunk!");
                System.out.println("Are you as hyped as I am?");
                System.out.println("Chu Chaga Chu Chaga Train Train!");
                System.out.print( System.lineSeparator());
                repeatCommandWithInfoText(sc);
                break;

            case "OwO":
                System.out.println("OwOBean");
                break;

            case "shrexit":
                return;

            default:
                System.out.println("Invalid number! Please enter a valid number as seen above!");
                System.out.print( System.lineSeparator());
                repeatCommandWithInfoText(sc);
                break;


        }
    }
    private static void repeatCommandWithInfoText(Scanner sc) throws IOException {
        String eingabe;
        writeInitHelpText();
        eingabe = sc.nextLine();
        operateCommand(eingabe, sc);
    }
}


