package _06_FunctionalProgramming.Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _03_CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        //1-ви начин с Function
        Function<List<Integer>, Integer> findMIN = list -> Collections.min(list);
        System.out.println(findMIN.apply(numbers));

        //2-ри начин с Consumer.
        Consumer<List<Integer>> findMinimal = list -> System.out.println(Collections.min(list));
        findMinimal.accept(numbers);
    }
}
