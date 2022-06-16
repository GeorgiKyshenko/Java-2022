package _02_MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix_06Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[matrixSize][];

        for (int i = 0; i < matrixSize; i++) {
            int[] matrixData = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = matrixData;
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        for (int i = matrix.length - 1; i >= 0; i--) {
            System.out.print(matrix[i][matrix.length - i - 1] + " ");
        }
        /* int i = matrix.length - 1 -> този израз в цикъла приема стойността на която се намира последният елемент
        * тоест ако матрицата е с 3 реда, matrix.length - 1, връща стойност 2 и започва да върти цикала от последният елемент(ред)*/
    }
}
