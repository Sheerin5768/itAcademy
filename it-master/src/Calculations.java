import java.util.Random;

public class Calculations {
    public static void main(String[] args) {
        int a = 24;
        int b = 12;
        int c = 30;
        int d = 41;
        int sum1 = a = 100 - (b = c) * 2 * 3 - 10 / 2 * (4 + 4) * d;
        System.out.println(sum1);
        int a1 = 3;
        a1 += 7;
        int b1 = 14;
        b1 -= 24;
        System.out.println(b1);
        a *=b;
        a/=b;
        d %=c;
        d++;
        b--;
        System.out.println("c=" + c + ", d = " + d);
        float a2 = 1.f / 3.f;
        System.out.println(a);
        System.out.printf("%f \n", a2);
        System.out.printf("%.2f \n", a2);
        System.out.printf("%.3f \n", a2);
        System.out.printf("%.4f \n", a2);
        int abs = Math.abs(-5);
        System.out.println(abs);
        double sqrt = Math.sqrt(169);
        System.out.println(sqrt);
        double sin = Math.sin(3.14 / 2);
        System.out.println(sin);
        double pow = Math.pow(4, 4);
        System.out.println("pow =" + pow);
        Random random = new Random();
        int X,Y;
        X = random.nextInt(); //Псевдослучайное число
        Y = random.nextInt(); //Это уже другое число
        int max = 20;
        int min = 1;
        int result = random.nextInt((max - min) + 1) + min;
        System.out.println("Рандомное число между min(" + min + ") и max(" + max + ") = ");


    }
}
