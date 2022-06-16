package _02_MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PositionOf_02Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] line = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = line[0];
        int cols = line[1];
        int[][] array = new int[rows][cols];
        boolean found = false;

        for (int i = 0; i < rows; i++) {
            int[] lines = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            array[i] = lines;
        }
        int searchedNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (searchedNumber == array[i][j]) {
                    System.out.printf("%d %d%n", i, j);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("not found");
        }
    }
}
