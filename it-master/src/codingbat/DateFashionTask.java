package codingbat;

public class DateFashionTask {
    public static void main(String[] args) {
        int couple1 = dateFashion(0, 0);
        int couple2 = dateFashion(5, 5);
        int couple3 = dateFashion(9, 3);
    }

    public static int dateFashion(int you, int date) {
        if (you <= 2 && date <= 2) return 0;
        else if (you <= 7 && date <= 7) return 1;
        else return 2;
    }
}