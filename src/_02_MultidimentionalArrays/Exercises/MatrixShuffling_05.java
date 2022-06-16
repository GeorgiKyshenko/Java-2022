package _02_MultidimentionalArrays.Exercises;

import java.util.Scanner;

public class MatrixShuffling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] matrixParameters = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(matrixParameters[0]);
        int cols = Integer.parseInt(matrixParameters[1]);
        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            String[] matrixElements = scanner.nextLine().split("\\s+");
            matrix[i] = matrixElements;
        }

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            if (!validate(command, rows, cols)) {
                System.out.println("Invalid input!");
            } else {
                String[] commandParts = command.split("\\s+");
                int row1 = Integer.parseInt(commandParts[1]);
                int col1 = Integer.parseInt(commandParts[2]);
                int row2 = Integer.parseInt(commandParts[3]);
                int col2 = Integer.parseInt(commandParts[4]);

                String firstElement = matrix[row1][col1];
                String secondElement = matrix[row2][col2];

                matrix[row1][col1] = secondElement;
                matrix[row2][col2] = firstElement;

                for (int row = 0; row < matrix.length; row++) {
                    for (int col = 0; col < matrix[row].length; col++) {
                        System.out.print(matrix[row][col] + " ");
                    }
                    System.out.println();
                }
            }
            command = scanner.nextLine();
        }
    }

    private static boolean validate(String command, int rows, int cols) {
        String[] commandParts = command.split("\\s+");
        if (commandParts.length != 5) {
            return false;
        }
        if (!commandParts[0].equals("swap")) {
            return false;
        }
        int row1 = Integer.parseInt(commandParts[1]);
        int col1 = Integer.parseInt(commandParts[2]);
        int row2 = Integer.parseInt(commandParts[3]);
        int col2 = Integer.parseInt(commandParts[4]);

        if (row1 < 0 || row1 >= rows || row2 < 0 || row2 >= rows || col1 < 0 || col1 >= cols || col2 < 0 || col2 >= cols) {
            return false;
        }
        return true;
    }
}
