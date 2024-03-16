        import java.util.Random;
public class MyRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt();
        number = random.nextInt(50);
        System.out.println(number);
    }
}
