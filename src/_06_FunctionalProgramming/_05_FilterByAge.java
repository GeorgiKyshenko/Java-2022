package _06_FunctionalProgramming;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class _05_FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> personList = new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {
            String[] data = scanner.nextLine().split(", ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            personList.put(name, age);
        }
        String condition = scanner.nextLine();
        int ageLimit = Integer.parseInt(scanner.nextLine());
        String printType = scanner.nextLine();

        BiPredicate<Integer, Integer> filterPredicate;

        if (condition.equals("younger")) {
            filterPredicate = (personsAge, age) -> personsAge <= age;
        } else {
            filterPredicate = (personsAge, age) -> personsAge >= age;
        }

        Consumer<Map.Entry<String, Integer>> printConsumer;

        if (printType.equals("age")) {
            printConsumer = person -> System.out.println(person.getValue());
        } else if (printType.equals("name")) {
            printConsumer = person -> System.out.println(person.getKey());
        } else {
            printConsumer = person -> System.out.println(person.getKey() + " - " + person.getValue());
        }

        personList.entrySet()
                .stream()
                .filter(el -> filterPredicate.test(el.getValue(), ageLimit) )
                .forEach(printConsumer);


    }
}
