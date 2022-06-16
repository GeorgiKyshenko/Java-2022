package _01_StackAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParenthesesLectorSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean areBalanced = false;

        for (int i = 0; i < line.length(); i++) {
            char currentBracket = line.charAt(i);

            if (currentBracket == '(' || currentBracket == '[' || currentBracket == '{') {
                stack.push(currentBracket);
            } else if (currentBracket == ')' || currentBracket == ']' || currentBracket == '}') {
                if(stack.isEmpty()) {
                    areBalanced = false;
                    break;
                }
                char lastOpen = stack.pop();

                if (currentBracket == ')' && lastOpen == '(') {
                    areBalanced = true;
                } else if (currentBracket == ']' && lastOpen == '[') {
                    areBalanced = true;
                } else if (currentBracket == '}' && lastOpen == '{') {
                    areBalanced = true;
                } else {
                    areBalanced = false;
                    break;
                }
            }
        }

       // System.out.println(areBalanced ? "YES" : "NO"); отпечатване с тернарен оператор, работи с boolean (ако е true отпечатващ "YES"
       // в противен случай "NO").

        if (areBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
