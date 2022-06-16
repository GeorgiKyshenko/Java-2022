package _06_FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _03_CountUpperCaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> upperCasePredicate = word -> Character.isUpperCase(word.charAt(0));
        Consumer<String> printer = word -> System.out.println(word);

        List<String> text = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(upperCasePredicate)
                .collect(Collectors.toList());

        System.out.println(text.size());
        text.forEach(printer);
    }
}
