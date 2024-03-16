import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;

public class HomeworkTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num1 = showInputDialog(null, "Enter first number");
        String num2 = showInputDialog(null, " Enter second number");
        int A = Integer.parseInt(num1);
        int B = Integer.parseInt(num2);
        int count = 0;
        int result = 0;
        if (A >= 0) {
            while (count != A) {
                result += B;
                result = result + 1;
            }
        } else {
            while (count != B & count != -B) {
                result += A;
                count = count + 1;
            }
            showInputDialog(null, A + " * " + B + " = "+result);
        }
    }
}



