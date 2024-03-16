import java.util.Scanner;

public class SheerinHomework {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printDashes(n);

    }
    static void printDashes(int dashCount) {
        for ( int count = 1; count <=dashCount; count++) {
            System.out.print("-");
        }
    }
}
