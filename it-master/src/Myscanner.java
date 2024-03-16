
import java.util.Scanner;

public class Myscanner {
    public static void main(String[] args) {
        Scanner Myscanner = new Scanner(System.in);
        String a= Myscanner.nextLine();
        System.out.println("I wrote "+a);
        String b = Myscanner.nextLine();
        System.out.println("I wrote " + b);
        String c = a + b;
        System.out.println("summa " + c);
    }
}
