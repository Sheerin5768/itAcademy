import java.util.Random;

import static javax.swing.text.html.HTML.Attribute.N;

public class ArrayTaskThree {
    public static void main (String[] args) {
        Random random = new Random();
        System.out.println("Массив случайных чисел");
        int size = 10;
        int[] numbers = new int[size];
        double sum = 0;
        for ( int i = 0; i < size; i++) {
            numbers[i] = random.nextInt( 101);
            sum = sum + numbers[i];

        }

        double average = sum / size;

        System.out.println("Средне арифмитическое: " + average );

    }
}
