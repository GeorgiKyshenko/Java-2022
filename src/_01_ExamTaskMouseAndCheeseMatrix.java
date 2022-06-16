import java.util.Scanner;

public class _01_ExamTaskMouseAndCheeseMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[n][n];

        for (int row = 0; row < n; row++) {
            String data = scanner.nextLine();
            char[] dataArray = data.toCharArray();
            matrix[row] = dataArray;
        }
        int mouseRow = -1;
        int mouseCol = -1;
        int cheeseCount = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                char currentSymbol = matrix[row][col];
                if (currentSymbol == 'M') {
                    mouseRow = row;
                    mouseCol = col;
                    break;
                }
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            matrix[mouseRow][mouseCol] = '-';
            switch (command) {
                case "up":
                    mouseRow--;
                    break;
                case "down":
                    mouseRow++;
                    break;
                case "left":
                    mouseCol--;
                    break;
                case "right":
                    mouseCol++;
                    break;
            }
            if (mouseRow < 0 || mouseRow >= n || mouseCol < 0 || mouseCol >= n) {
                System.out.println("Where is the mouse?");
                break;
            }
            if (matrix[mouseRow][mouseCol] == 'c') {
                cheeseCount++;
            } else if (matrix[mouseRow][mouseCol] == 'B') {
                continue;
            }
            matrix[mouseRow][mouseCol] = 'M';
            command = scanner.nextLine();
        }
        if(cheeseCount >=5) {
            System.out.printf("Great job, the mouse is fed %d cheeses!%n", cheeseCount);
        } else {
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.%n",5 - cheeseCount);
        }
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
