import java.util.Random;

import static javax.swing.JOptionPane.showInputDialog;

public class MatricsTask {
    public static void main(String[] args) {
        Random random = new Random();
        int lines = 4, columns = 4;
        int[][] matrix = new int[lines][columns];
        double sum = 0;
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(255);
                sum += matrix[i][j];
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        double average = sum / (lines * columns);

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] < average) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = 255;
                }
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
