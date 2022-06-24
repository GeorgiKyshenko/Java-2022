package _10_ExamPrep02;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bomb_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(",");

        char[][] field = new char[size][size];

        int sapperRow = 0;
        int sapperCol = 0;
        int bombCount = 0;

        for (int row = 0; row < field.length; row++) {

            List<Character> characterList = Arrays.stream(scanner.nextLine().split(" "))
                    .map(e -> e.charAt(0))
                    .collect(Collectors.toList());

            /* или char[] arr = scanner.nextLine().replace(" ","").toCharArray();
             field[row] = arr;
              запълване на матрица с char input разделен със space*/

            for (int col = 0; col < characterList.size(); col++) {
                char currentChar = characterList.get(col);
                if (currentChar == 's') {
                    sapperRow = row;
                    sapperCol = col;
                } else if (currentChar == 'B') {
                    bombCount++;
                }
                field[row][col] = currentChar;
            }
        }
        int bombsFound = 0;

        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "up":
                    if (sapperRow != 0) {
                        sapperRow--;
                    }
                    break;
                case "down":
                    if (sapperRow != field.length - 1) {
                        sapperRow++;
                    }
                    break;
                case "right":
                    if (sapperCol != field[sapperRow].length - 1) {
                        sapperCol++;
                    }
                    break;
                case "left":
                    if (sapperCol != 0) {
                        sapperCol--;
                    }
                    break;
            }

            if (field[sapperRow][sapperCol] == 'B') {
                field[sapperRow][sapperCol] = '+';
                bombsFound++;
                System.out.println("You found a bomb!");
                if (bombCount == bombsFound) {
                    System.out.println("Congratulations! You found all bombs!");
                    return;
                }
            } else if (field[sapperRow][sapperCol] == 'e') {
                System.out.printf("END! %d bombs left on the field", bombCount - bombsFound);
                return;
            }
        }
        System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)", bombCount - bombsFound, sapperRow, sapperCol);
    }
}
