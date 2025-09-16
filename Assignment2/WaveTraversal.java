package Class;

import java.util.Scanner;

public class WaveTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];

        // input matrix
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();

        // wave traversal
        for (int j = 0; j < cols; j++) {
            if (j % 2 == 0) {
                // top to bottom
                for (int i = 0; i < rows; i++)
                    System.out.print(matrix[i][j] + " ");
            } else {
                // bottom to top
                for (int i = rows - 1; i >= 0; i--)
                    System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
