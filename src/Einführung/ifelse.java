package Einführung;

public class ifelse {
    public static void main(String[] args) {
        // if (Bedingung) { wahr oder falsch --> wahr wird ausgeführt. Falsch mit Else aufgefangen.
        int number = 2;
        if (number == 5) { //test (==) hat number wirklich den Wert 5?
            System.out.println("Number ist gleich 5");
        } else {
            System.out.println("Number ungleich 5");
        }

        int number1 = 2;
        if (number1 != 5) { //test (==) hat number1 wirklich ungleich ist?
            //< > <= >=
            System.out.println("Number ist ungleich 5");
        } else {
            System.out.println("Number gleich 5");
        }

        boolean bool = false;
        if (bool) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        int number2 = 1;
        boolean erhöhen = (number2 <= 5);
        if (erhöhen) {
            number2 += 3;
            System.out.println(number2);
        } else {
            System.out.println(number2);
        }


        int number = 17;
        boolean Alter = (number >= 18);
        if (Alter) {
            System.out.println("Volljährig");
        } else {
            System.out.println("Minderjährig");
        }

    }
}
