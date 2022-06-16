package _03_SetMapsAdvanced.Exercises;

import java.util.*;

public class _03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> elements = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] chemicalEl = scanner.nextLine().split("\\s+");

            elements.addAll(Arrays.asList(chemicalEl));    //1-ви вариант

            /*Collections.addAll(Arrays.asList(chemicalEl), elements); <- 2-ри вариант
            или 3ти вариант
            /*for (String el: chemicalEl) {
                elements.add(el);
             */
        }
        elements.forEach(el -> System.out.print(el + " "));
    }
}
