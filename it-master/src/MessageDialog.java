import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class MessageDialog {
    public static void main(String[] args) {
        showMessageDialog(null, "hello");
        String text = showInputDialog("hiii");
        System.out.println("My next" + text);
        int number = Integer.parseInt(text);
        System.out.println("573" + text);
        int number2 = 1234 + number;
        System.out.println(number2);
        String text2 = showInputDialog("Введите дробное число");
        double number3 = Double.parseDouble(text2);
        System.out.println(number3 + 4.2);
        double sum = number2 + number3;
        String result =
                "Первое число" + number + "\n" +
                        "Второе число" + number2 +"\n" +
                        "Третье число" + number3 +"\n" +
                        "Сумма чисел" + sum;
        showMessageDialog(null, result);
    }
}
