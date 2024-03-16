import java.util.Scanner;

public class ProcedureTaskOne {
    public static void main(String[] args) {

        calculateMultiplicationTable();
    }

        public static void calculateMultiplicationTable () {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i = 0; i<10; i++) {
            System.out.println( num + " * " + i + " * " + " = " + i * num);
        }


        }

    }