package _02_MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements_04Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] matrix = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(matrix[0]);
        int cols = Integer.parseInt(matrix[1]);
        int[][] multiArray = new int[rows][cols];

        //тука елементите се запълват един по един.

        for (int row = 0; row < rows; row++) {
            String[] rowOfMatrix = scanner.nextLine().split(", ");
            for (int col = 0; col < cols; col++) {
                multiArray[row][col] = Integer.parseInt(rowOfMatrix[col]);
            }
        }


        /* втори вариант за запълване на матрица ->
         тука матрицата се запълва директно ред по ред без да ни интересуват колоните. */

        for (int i = 0; i < rows; i++) {
            int[] rowOfMatrix = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            multiArray[i] = rowOfMatrix;
        }


        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += multiArray[i][j];
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}
