package Einführung;

import java.util.Arrays;

public class Textausgabe {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hey Pirate");
        System.out.println("Just Testing");

        for (String s : Arrays.asList("Dies ist", "m", "e", "i", "n", "e", "erste", "UEBUNG")) System.out.println(s);

        String name = "Nick";
        System.out.println("Mein Name ist " + name + ", sei gegrüßt!");

        int guests = 11;

        guests = guests - 1; //Absage

        System.out.println("Anzahl der Gäste die kommen: " + guests);

        guests = guests + 3; //3 Zusagen

        System.out.println("Anzahl der Gäste die kommen: " + guests);

        guests -= 1; //Absage - Kurzschreibweise (-=/+=)

        System.out.println("Anzahl der Gäste die kommen: " + guests);

        guests--; //Kurzschreibweise für Integer Datentyp (--/++)

        System.out.println("Anzahl der Gäste die kommen: " + guests);
    }
}

