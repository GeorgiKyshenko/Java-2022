package _12_LiveExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StickyFingers_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(",");

        char[][] matrix = new char[size][size];

        int currentRow = 0;
        int currentCol = 0;

        for (int row = 0; row < size; row++) {
            List<Character> characterList = Arrays.stream(scanner.nextLine().split(" "))
                    .map(e -> e.charAt(0))
                    .collect(Collectors.toList());

            for (int col = 0; col < characterList.size(); col++) {
                char currentChar = characterList.get(col);
                if (currentChar == 'D') {
                    currentRow = row;
                    currentCol = col;
                }
                matrix[row][col] = currentChar;
            }
        }
        int totalMoney = 0;

        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "up":
                    if (currentRow != 0) {
                        matrix[currentRow][currentCol] = '+';
                        currentRow--;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
                case "down":
                    if (currentRow != matrix.length - 1) {
                        matrix[currentRow][currentCol] = '+';
                        currentRow++;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
                case "right":
                    if (currentCol != matrix[currentRow].length - 1) {
                        matrix[currentRow][currentCol] = '+';
                        currentCol++;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
                case "left":
                    if (currentCol != 0) {
                        matrix[currentRow][currentCol] = '+';
                        currentCol--;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
            }
            if (matrix[currentRow][currentCol] == '$') {
                totalMoney += currentRow * currentCol;
                matrix[currentRow][currentCol] = 'D';
                System.out.printf("You successfully stole %d$.%n", currentRow * currentCol);

            } else if (matrix[currentRow][currentCol] == 'P') {
                System.out.printf("You got caught with %d$, and you are going to jail.%n", totalMoney);
                matrix[currentRow][currentCol] = '#';
                for (int row = 0; row < size; row++) {
                    for (int col = 0; col < size; col++) {
                        System.out.print(matrix[row][col] + " ");
                    }
                    System.out.println();
                }
                return;
            }
            else if (matrix[currentRow][currentCol] == '+') {
                matrix[currentRow][currentCol] = 'D';
            }
            if (i == commands.length - 1) {
                System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n", totalMoney);
            }
        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
