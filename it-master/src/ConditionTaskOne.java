import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class ConditionTaskOne {
    public static void main (String [] args) {
        String B =showInputDialog( null, "Введите первое числа");
        String A = showInputDialog( null, "Введите второе числа");
        int C =  Integer.parseInt(B);
        int D = Integer.parseInt (A);
        if (C > D) {
            showMessageDialog(null," C больше D");


        }else if ( D > C ) {
            showMessageDialog (null, " D больше С ");
        }
    }
}
