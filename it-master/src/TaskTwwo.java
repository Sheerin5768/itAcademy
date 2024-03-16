import java.util.Scanner;

public class TaskTwwo {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int num1;
        num1 = scanner.nextInt();
        boolean hasNumbersNear = false;
        do {
            int lastDigit = num1 % 10;
            num1 = num1 / 10;
            int preLastDigit = num1 % 10;
            if (lastDigit == preLastDigit) {
                hasNumbersNear = true;
                break;
            }

        } while (num1 > 0);
        if (hasNumbersNear) {
            System.out.println(" Есть цифры стоящие рядом");
        } else {
            System.out.println(" Нет цифр стоящих рядом");
        }
    }
    }
