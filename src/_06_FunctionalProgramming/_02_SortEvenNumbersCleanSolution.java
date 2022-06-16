package _06_FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_SortEvenNumbersCleanSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringNumbers = scanner.nextLine().split(", ");

        List<String> list1 = Arrays.stream(stringNumbers)
                .map(e -> Integer.parseInt(e))
                .filter(e -> e % 2 == 0)
                .map(e -> e.toString())
                .collect(Collectors.toList());

        System.out.println(String.join(", ", list1));

        list1 = list1.stream()
                .map(e -> Integer.parseInt(e))
                .sorted()
                .map(e -> e.toString())
                .collect(Collectors.toList());

        System.out.println(String.join(", ",list1));


    }
}
