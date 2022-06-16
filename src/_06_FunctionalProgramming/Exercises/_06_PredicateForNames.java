package _06_FunctionalProgramming.Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Predicate;

public class _06_PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split("\\s+");

        /*
        1. - без Predicate.
        Arrays.stream(names)
                .filter(el -> el.length() <= n)
                .forEach(el -> System.out.println(el));
        */

        Predicate<String> filter = el -> el.length() <= n;

        Arrays.stream(names)
                .filter(filter)
                .forEach(System.out::println);
    }
}
