import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showInputDialog;

public class sheerinObmenka {
    public static void main (String[] args) {
        int currency =Integer.parseInt( showInputDialog("Введите валюту USD, EUR, RUB") );
        float amount =Float.parseFloat( showInputDialog("Введите сумму"));
        //int operation = showConfirmDialog("Введите тип операции, нажми Yes, если покупка , ажми No, сли продажа");
       // if ( amount <= 200000:
        System.out.print("Превышен лимит суммы");
        //else
            //if currency == "USD"


    }

    //rivate static int showConfirmDialog(String введитеТипОперации) //{
    }

