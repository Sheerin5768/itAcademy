package Homework;

import java.util.Scanner;

public class MyHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        System.out.println("Введите третье число");
        int c = sc.nextInt();
        System.out.println("Введите четвертое число");
        int d = sc.nextInt();
        System.out.println("Введите пятое число");
        int e = sc.nextInt();

        if (a > b && a > c && a > d && a > e) ;
        {
            System.out.println("Самое большое число" + a);
        }
        if (b > a && b > c && b > d && b > e)
        {
            System.out.println("Самое ольшое число" + b);
        }

        else if (c > a && c > b && c > d && c > e)
        {
            System.out.println("Самое большое число" + c);
        }
        else if(d > a && d > b && d > c && d > e)
        {
            System.out.println("Самое боьшое число" + d);
        }
        else if (e > a && e > b && e > c && e > d)
        {
            System.out.println("Самое большое число" + e);
        }



    }
}
