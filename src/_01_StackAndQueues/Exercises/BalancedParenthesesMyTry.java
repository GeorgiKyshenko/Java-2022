package _01_StackAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParenthesesMyTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] parentheses = scanner.nextLine().toCharArray();

        ArrayDeque<Character> que = new ArrayDeque<>();
        ArrayDeque<Character> que2 = new ArrayDeque<>();

        for (int i = 0; i < parentheses.length / 2; i++) {
            que.offer(parentheses[i]);
        }

        for (int i = parentheses.length - 1; i >= parentheses.length / 2; i--) {
            que2.offer(parentheses[i]);
        }

        int first = 0;
        int second = 0;

        if (que.size() != 0 && que2.size() != 0 && que.size() == que2.size() && parentheses.length % 2 ==0) {
            for (int i = 0; i < parentheses.length / 2; i++) {
                if (que.peekFirst().equals('(') && que2.peekFirst().equals(')')) {
                    que.poll();
                    que2.poll();
                    first++;
                    second++;
                } else if (que.peekFirst().equals('[') && que2.peekFirst().equals(']')) {
                    que.poll();
                    que2.poll();
                    first++;
                    second++;
                } else if (que.peekFirst().equals('{') && que2.peekFirst().equals('}')) {
                    que.poll();
                    que2.poll();
                    first++;
                    second++;
                } else {
                    first++;
                    break;
                }
            }
        } else {
            first++;
        }
        if (first == second) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
