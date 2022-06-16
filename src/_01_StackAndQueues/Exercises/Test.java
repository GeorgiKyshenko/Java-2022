package _01_StackAndQueues.Exercises;

import java.util.*;

import static java.util.Arrays.asList;

public class Test {
    public static void main(String[] args) {
        String[] words = new String[]{"0", "2", "3", "4", "5"};
        ArrayDeque<String> stack = new ArrayDeque<>();

        stack.addAll(asList(words));   // addAll е метод за Queue (опашка)
        for (String n : stack) {
            stack.pop();
            System.out.print(n + " ");
        }
        System.out.println();



        int[] parse = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            parse[i] = Integer.parseInt(words[i]);
        }
        List<Integer> list = Arrays.stream(parse).boxed().toList();   // тестване - превръщане на int array в int List  и намиране на минималното число.
        System.out.println(Collections.min(list));
    }
}
