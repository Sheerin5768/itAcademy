import java.util.Scanner;

public class ArraysExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 10;
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }
        System.out.println("Массив A: ");
        for (int i = 0; i < N; i++) {
            System.out.println (A[i] + " ");
        }
    }
}
