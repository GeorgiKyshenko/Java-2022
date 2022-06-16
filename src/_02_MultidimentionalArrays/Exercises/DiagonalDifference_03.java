package _02_MultidimentionalArrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixSize = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[matrixSize][matrixSize];
        int sumFirstDiagonal = 0;
        int sumSecondDiagonal = 0;
        for (int i = 0; i < matrixSize; i++) {
            int[] matrixData = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = matrixData;
        }
        for (int i = 0; i < matrix.length; i++) {
            sumFirstDiagonal += matrix[i][i];
        }
        for (int i = matrix.length - 1; i >= 0; i--) {
            sumSecondDiagonal += matrix[i][matrix.length - i - 1];
        }
        System.out.println(Math.abs(sumFirstDiagonal - sumSecondDiagonal));
    }
}
