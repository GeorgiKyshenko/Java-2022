package _01_StackAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] numbersToAdd = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < numbers[0]; i++) {
            stack.push(numbersToAdd[i]);
        }
        for (int i = 0; i < numbers[1]; i++) {
            stack.pop();
        }
        if(stack.contains(numbers[2])) {
            System.out.println("true");
        } else {
            if(stack.isEmpty()) {
                System.out.println("0");
            } else {
                System.out.println(Collections.min(stack));
            }
        }
    }
}
