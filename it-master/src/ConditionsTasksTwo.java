import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class ConditionsTasksTwo {
    public static void main(String[] args) {
        String B = showInputDialog(null, "Введите первое числа");
        String A = showInputDialog(null, "Введите второе числа");
        String E = showInputDialog(null, "Введите третье числа");
        int C = Integer.parseInt(B);
        int D = Integer.parseInt(A);
        int F = Integer.parseInt(E);

        if (C > D) {
            if (C > F) {
                showMessageDialog(null, " C самое большое число");
            } else {
                showMessageDialog(null, " F самое большое число");


            }


        } else {
            showMessageDialog(null, " D самое большое число ");

        }
    }
}
