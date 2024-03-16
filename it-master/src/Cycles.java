import java.util.Scanner;

public class Cycles {
    public static void main (String[] args) {
        while (true) {
            System.out.println("Привет");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            int count = 0;
            while (num > 0) {
                num = num / 10;
                count = count + 1;
            }
            System.out.println("Количество цифр в числе" + count);
        }

    }
}
