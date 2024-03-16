public class FunctionsExampleOne {
    public static void main (String[] args) {
        int sum = calculateSum( 4,7,12);
        System.out.println(sum);
    }
    static int calculateSum ( int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;

    }
}
