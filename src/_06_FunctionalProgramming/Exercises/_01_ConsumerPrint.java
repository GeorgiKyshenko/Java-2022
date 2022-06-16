package _06_FunctionalProgramming.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class _01_ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        //1-ви вариант
        Consumer<List<String>> print = array ->{
            for (String name : names) {
                System.out.println(name);
            }
        };
        print.accept(names);
        System.out.println();

        // 2ри вариант
        Consumer<String> printer = el -> System.out.println("Sir " + el);
        names.forEach(printer);
        System.out.println();

        //3ти вариант

        for (String name : names) {
            printer.accept(name);
        }
    }
}
