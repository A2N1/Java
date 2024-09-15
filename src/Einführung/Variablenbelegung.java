package Einführung;

public class Variablenbelegung {
    public static void main(String[] args) {
        //Datentyp: Gibt an, von welcher Art die Variable ist.
        String s = "4"; // nicht aendern
        String haeufigkeit = "23"; //nicht aendern
        int b = 7; //nicht aendern
        int zahl = 19;//nicht aendern
        String kartoffel = "Bohne"; //nicht aendern
        String kurz = "001"; //nicht aendern
        String ende = ""; //nicht aendern

        //---------- Beginn eigener Code: Nachfolgend eigenen Code einfügen -------
        s = "der ist heute";
        haeufigkeit = "31";
        b = 3;
        zahl = 2;
        kartoffel = "Februar, ";
        kurz = "110";
        ende = "system";
        //---------- Ende eigener Code -----------
        System.out.print("Der " + haeufigkeit +  ". " + kartoffel + s +"!" +"\nDenn " ); //nicht aendern
        System.out.print(zahl + " * " + b + " ist bekanntlich " + kurz + ", aber nur im Binaer"+ende);//nicht aendern

        int number = 3;
        int number2 = 14;
        int sum = number + number2;
        System.out.println("Ich bin " + sum + " Jahre alt.");

        int anzahl = 12;
        String obst = " Birnen";
        System.out.println("Ich hätte gerne " + anzahl + obst);

        //int (integer) = Zahlen
        //String = Zeichenketten
        //double = Fließkommazahlen oder Gleitkommazahlen
        //boolean = Steht für einen Wert, welcher entweder "true" oder "false" sein kann

        //byte
        //short
        //long
        //float
        //char (character) = Eine Stelle nur!

        //https://www.youtube.com/playlist?list=PLO-P6W97sI0Q-o0oZy8NeUgi0s5WKK8IV
    }

}
