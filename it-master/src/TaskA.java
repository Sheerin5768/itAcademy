import java.util.Scanner;

public class TaskA {
    public static void main (String[] args) {
        System.out.println("Введите два целых числа A и B");
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        while ( A<=B) {
            int result = A * A ;
            System.out.println(" A * A=" + result);
            A = A + 1;

        }



    }
}
