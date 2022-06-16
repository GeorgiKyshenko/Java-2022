package _02_MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements_04EasyMode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int index1 = number[0];
        int index2 = number[1];
        int sum = 0;

        for (int i = 0; i < index1; i++) {
            int line = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).sum();
            sum += line;
        }
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(sum);
    }
}
