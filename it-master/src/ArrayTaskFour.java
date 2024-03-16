import java.util.Random;

public class ArrayTaskFour {
    public static void main(String[] args) {
                Random random = new Random();
                System.out.println("Массив случайных чисел");
                int size = 10;
                int[] numbers = new int[size];
                int count = 0;
                double sum = 0;
                double sum2 = 0;
                for ( int i = 0; i < size; i++) {
                    numbers[i] = random.nextInt( 101);
                    if ( numbers[i] < 50) {
                        //sum
                    }
                    sum = sum + numbers[i];

                }

        double average = sum / size;

            }
}
