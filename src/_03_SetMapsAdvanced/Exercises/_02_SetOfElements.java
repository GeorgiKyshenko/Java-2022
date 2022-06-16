package _03_SetMapsAdvanced.Exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _02_SetOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int firstSetSize = Integer.parseInt(input.split("\\s+")[0]);
        int secondSetSize = Integer.parseInt(input.split("\\s+")[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < firstSetSize; i++) {
            firstSet.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int i = 0; i < secondSetSize; i++) {
            secondSet.add(Integer.parseInt(scanner.nextLine()));
        }
        Set<Integer> duplicates = new LinkedHashSet<>();
        for (int number : firstSet) {
            if(secondSet.contains(number)) {
                duplicates.add(number);
            }
        }
        duplicates.forEach(el-> System.out.print(el + " "));

        /*втори вариант, retainAll премахва всички елементи от firstSet, които ги няма в secondSet.
        firstSet.retainAll(secondSet);
        firstSet.forEach(el-> System.out.print(el + " "));

         */
    }
}
