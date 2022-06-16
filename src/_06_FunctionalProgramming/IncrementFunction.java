package _06_FunctionalProgramming;

import java.util.function.Function;

public class IncrementFunction {
    public static void main(String[] args) {

        Function<Integer, Integer> increment = number -> number + 1;

        int a = increment.apply(5);
        int b = increment.apply(a);

        System.out.println(a);
        System.out.println(b);
    }
}