import java.util.Scanner;

public class HomeworkSheerinFirstTask {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 5;
        for(int quantity = 1; quantity<=10; quantity++) {
            System.out.println(num + " * " + quantity + " = " + quantity + num);
        }
    }
}
