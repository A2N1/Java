import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {

    // Feste Wechselkurse (Beispielwerte)
    private static final Map<String, Double> EXCHANGE_RATES = new HashMap<>();
    static {
        EXCHANGE_RATES.put("EUR_TO_USD", 1.10);
        EXCHANGE_RATES.put("USD_TO_EUR", 0.91);
        EXCHANGE_RATES.put("EUR_TO_GBP", 0.85);
        EXCHANGE_RATES.put("GBP_TO_EUR", 1.18);
        EXCHANGE_RATES.put("EUR_TO_CHF", 0.95);
        EXCHANGE_RATES.put("CHF_TO_EUR", 1.05);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen beim Währungsumrechner!");
        System.out.println("Verfügbare Währungen: EUR, USD, GBP, CHF");

        System.out.print("Geben Sie den Betrag ein: ");
        double amount = scanner.nextDouble();

        System.out.print("Geben Sie die Ausgangswährung ein (z. B. EUR): ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("Geben Sie die Zielwährung ein (z. B. USD): ");
        String toCurrency = scanner.next().toUpperCase();

        double convertedAmount = convertCurrency(amount, fromCurrency, toCurrency);

        if (convertedAmount != -1) {
            System.out.printf("%.2f %s sind %.2f %s%n", amount, fromCurrency, convertedAmount, toCurrency);
        } else {
            System.out.println("Ungültige Währung oder Wechselkurs nicht verfügbar.");
        }

        scanner.close();
    }

    private static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        String key = fromCurrency + "_TO_" + toCurrency;
        if (EXCHANGE_RATES.containsKey(key)) {
            return amount * EXCHANGE_RATES.get(key);
        } else {
            // Versuche, den umgekehrten Wechselkurs zu finden
            String reverseKey = toCurrency + "_TO_" + fromCurrency;
            if (EXCHANGE_RATES.containsKey(reverseKey)) {
                return amount / EXCHANGE_RATES.get(reverseKey);
            }
        }
        return -1; // Fehlerfall
    }
}
