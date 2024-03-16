import java.util.Scanner;

public class TaskOne {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 ;
        do {
            System.out.println("Введите позитивное число");
            num1 = scanner.nextInt();
        } while ( num1 >= 0 );

    }

}
