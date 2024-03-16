import jdk.jfr.FlightRecorder;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import java.util.Random;
public class Homework {
    public static void main (String [] args) {

        String variable1 = showInputDialog("Введите длину отрезка A");
        double A = Float.parseFloat(variable1);
        String variable2 = showInputDialog("Введите длину отрезка B");
        double B = Float.parseFloat(variable2);
        String variable3 = showInputDialog("Введите длину отрезка C");
        double C = Float.parseFloat(variable3);
        String variable4 = showInputDialog( "Введите длину отрезка D");
        double D = Float.parseFloat(variable4);
        double AB = Math.sqrt(Math.pow(A - B, 2) + Math.pow( C - D, 2));
        showMessageDialog(null, "Длина равна =" + AB);



}



}
