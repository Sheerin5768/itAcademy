import java.util.Scanner;

public class Task {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = calculateSomeOfDigist(number);
        if ( sum >= 50) {
            System.out.println(" Ты ввел число больше или равное 50");
        }
        else {
            System.out.println(" Ты ввел число больше или равное 50");
        }
//        if ( num 50>0)

    }
    static int calculateSomeOfDigist ( int num) {

        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
            return sum;
    }
}
