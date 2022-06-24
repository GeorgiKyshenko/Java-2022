package _11_ExamPrep03;

import java.util.Scanner;

public class CookingJourney_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        String[][] matrix = new String[size][size];

        int currentRow = 0;
        int currentCol = 0;

        int firstPillarRow = 0;
        int firstPillarCol = 0;

        int secondPillarRow = 0;
        int secondPillarCol = 0;

        boolean foundFirstPillar = false;


        for (int row = 0; row < size; row++) {
            String[] input = scanner.nextLine().split("");
            for (int col = 0; col < size; col++) {
                matrix[row][col] = input[col];

                if (matrix[row][col].equals("S")) {
                    currentRow = row;
                    currentCol = col;
                } else if (matrix[row][col].equals("P") && !foundFirstPillar) {
                    firstPillarRow = row;
                    firstPillarCol = col;
                    foundFirstPillar = true;
                } else if (matrix[row][col].equals("P") && foundFirstPillar) {
                    secondPillarRow = row;
                    secondPillarCol = col;
                }
            }
        }
        int money = 0;
        while (money < 50) {

            String command = scanner.nextLine();
            matrix[currentRow][currentCol] = "-";

            switch (command) {
                case "up":
                    currentRow--;
                    break;
                case "down":
                    currentRow++;
                    break;
                case "right":
                    currentCol++;
                    break;
                case "left":
                    currentCol--;
                    break;
            }

            if (currentRow < 0 || currentRow >= size || currentCol < 0 || currentCol >= size) {
                break;
            }

            if (currentRow == firstPillarRow && currentCol == firstPillarCol) {
                matrix[firstPillarRow][firstPillarCol] = "-";
                currentRow = secondPillarRow;
                currentCol = secondPillarCol;
                matrix[currentRow][currentCol] = "S";
            } else if (currentRow == secondPillarRow && currentCol == secondPillarCol) {
                matrix[secondPillarRow][secondPillarCol] = "-";
                currentRow = firstPillarRow;
                currentCol = firstPillarCol;
                matrix[currentRow][currentCol] = "S";
            } else if (matrix[currentRow][currentCol].equals("-")) {
                matrix[currentRow][currentCol] = "S";
            } else {
                money += Integer.parseInt(matrix[currentRow][currentCol]);
                matrix[currentRow][currentCol] = "S";
            }
        }
        if (money >= 50) {
            System.out.println("Good news! You succeeded in collecting enough money!");
        } else {
            System.out.println("Bad news! You are out of the pastry shop.");
        }
        System.out.println("Money: " + money);
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
