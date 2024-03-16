package funcshions;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class CurrencyTasks {
    public static void main(String[] args) {
        String currency = showInputDialog(null, "Введите валюту USD, EUR,RUB");
        double currencyRate = getCurrencyRate(currency);
        showMessageDialog(null, "Your currency rate" + currencyRate);
    }

    static double getCurrencyRate(String currency) {
        double rate;
        switch (currency) {
            case "USD":
                rate = 89.32;
                break;
            case "EUR":
                rate = 97.17;
                break;
            case "RUB":
                rate = 0.98;
                break;
            default:
                rate = 1;
        }
        return rate;
    }
}
