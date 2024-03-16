import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTask4 {
    public static void main (String[] args) {
        Random random = new Random(6);
        int size = 10;
        int serchindex= -1;
        int [] nums = new int[size];
        System.out.println("Вывести число x, и найти все значения x");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for ( int i = 0; i< size; i++){
            nums [i] = random.nextInt(11)+10;
            if (nums[i] == x) {
                serchindex = i;
                System.out.println("num[" + serchindex +"] = "+ x);

            }

        }
        if ( serchindex < 0)  System.out.println("Не нашли!");
        System.out.println(Arrays.toString(nums));

    }

}
