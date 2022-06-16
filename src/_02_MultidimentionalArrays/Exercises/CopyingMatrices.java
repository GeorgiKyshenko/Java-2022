package _02_MultidimentionalArrays.Exercises;

import java.util.Scanner;

public class CopyingMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] matrix = new int[4][4];

        fillMatrix(matrix,scanner);

        int[][] copied  = new int[4][4];


        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                copied[row][col] = matrix[row][col];
            }
        }
        printMatrix(copied);
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
