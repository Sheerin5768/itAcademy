public class ProceduresWithParams {
    public static void main (String[] args) {
        calculateAverage(12,54);
        printSum(3,7,9);
        printSum(12,6,45);
        printSum(67,543,65);
    }
    static void printSum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        System.out.println("Sum:" + sum);
    }
    static void calculateAverage(int num1, int num2) {

        int sum = num1 + num2;
        System.out.println(sum / 2);
    }
}
