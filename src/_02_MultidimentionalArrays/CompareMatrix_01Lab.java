package _02_MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrix_01Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstMatrixData = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int firstRow = firstMatrixData[0];
        int firstCols = firstMatrixData[1];
        int[][] firstsMatrix = new int[firstRow][firstCols];
        for (int i = 0; i < firstRow; i++) {
            int[] rowData = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            firstsMatrix[i] = rowData;
        }

        int[] secondMatrixData = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int secondRow = secondMatrixData[0];
        int secondCols = secondMatrixData[1];
        int[][] secondMatrix = new int[secondRow][secondCols];
        for (int i = 0; i < secondRow; i++) {
            int[] rowData = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            secondMatrix[i] = rowData;
        }

        /*можем да проверим дали редовете и колоните на 1вата, са равни на редовете и колоните на 2рата
        ако не са, направо принтираме "not equal" и return прекратява main метода.

        if (firstRow != secondRow || firstCols != secondCols) {
            System.out.println("not equal");
            return;
        }
        for (int row = 0; row < firstRow; row++) {
            for (int col = 0; col < secondCols; col++) {
                if(firstsMatrix[row][col] != secondMatrix[row][col]) {
                    System.out.println("not equal");
                    return;
                }
            }
        }
        System.out.println("equal");

        целият коментар е решението на лектора, моят е долу, преди да видя това на лектора.
        */

        /* моето решение НЕ е правилно, защото с четири цикъла сравнявам един елемент от 1вата матрица дали е равен на
        всеки от елементите на втората матрица. Въпреки, че в Judge ми дава 100/100 резултат.
         */

        boolean areEqual = true;

        for (int i = 0; i < firstRow; i++) {
            for (int j = 0; j < firstCols; j++) {
                for (int k = 0; k < secondRow; k++) {
                    for (int l = 0; l < secondCols; l++) {
                        if (firstsMatrix[i][j] == secondMatrix[k][l]) {
                            areEqual = true;
                        } else {
                            areEqual = false;
                            break;
                        }
                    }
                }
            }
        }
        if (areEqual) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
