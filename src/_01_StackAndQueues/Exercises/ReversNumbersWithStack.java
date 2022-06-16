package _01_StackAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReversNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] string = scanner.nextLine().split(" ");
        int[] n = new int[string.length];
        for (int i = 0; i < string.length; i++) {
            n[i] = Integer.parseInt(string[i]);
        }
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n.length; i++) {
            stack.push(n[i]);
        }
        for (Integer num : stack) {
            System.out.print(num + " ");
        }
    }
}
