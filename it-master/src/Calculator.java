import java.util.Scanner;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;

public class Calculator {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = showInputDialog("Enter first number");
        String b = showInputDialog("Enter second number");
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        double result;
        String operation = showInputDialog("Enter he operation");
        switch(operation) {
            case "+":
                result = num1+num2;
                break;
            case "-":
                result = num1-num2;
                break;
            case "*":
                result = num1*num2;
                break;
            case "/":
                result = num1/num2;
                break;

            default:
                result = 0;


        }
        System.out.println(num1 + " " + operation +" " + num2 + " = " + result);

    }
}
