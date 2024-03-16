import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        System.out.println("Введите минимальное число");
        int max = scanner.nextInt();
        System.out.println("Введите максимальное число");
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(( max - min) + 1 ) + min;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
        System.out.println((Arrays.toString(array)));
    }
}
