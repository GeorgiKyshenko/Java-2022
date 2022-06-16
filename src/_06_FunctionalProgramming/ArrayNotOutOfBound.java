package _06_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNotOutOfBound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.length; i++) {
            if(i == numbers.length - 1) {
                System.out.print(numbers[i]  + " ");
                break;
            }
            if (numbers[i] > numbers[i + 1]) {
                System.out.print(numbers[i + 1] + " ");
                System.out.print(numbers[i] + " ");
                i++;
            } else {
                System.out.print(numbers[i] + " ");
                System.out.print(numbers[i + 1] + " ");
                i++;
            }
        }
    }
}
