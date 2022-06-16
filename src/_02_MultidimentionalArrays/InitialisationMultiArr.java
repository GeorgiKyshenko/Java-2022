package _02_MultidimentionalArrays;

public class InitialisationMultiArr {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] arr = new int[2][3];
        for (int row = 0; row < 2; row++) {         // напълване на матрица с вложен цикъл.
            for (int col = 0; col < 3; col++) {
                arr[row][col] = row + col;
            }
        }
        for (int row = 0; row < 2; row++) {        // отпечатване на матрица (print).
            for (int col = 0; col < 3; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
