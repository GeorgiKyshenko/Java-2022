package _02_MultidimentionalArrays;

import java.util.Scanner;

public class IntersectionOfTwoMatrix_03Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        String[][] firstMatrix = new String[rows][cols];
        String[][] secondMatrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] data = scanner.nextLine().split(" ");
            firstMatrix[i] = data;
        }
        for (int j = 0; j < rows; j++) {
            String[] data = scanner.nextLine().split(" ");
            secondMatrix[j] = data;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(firstMatrix[i][j].equals(secondMatrix[i][j])) {
                    System.out.print(firstMatrix[i][j]+ " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
