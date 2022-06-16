package _03_SetMapsAdvanced;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortingInMaps {
    public static void main(String[] args) {
        Map<String, Integer> students = new LinkedHashMap<>();
        students.put("Georgi", 6);
        students.put("Ivan", 4);
        students.put("Petar", 3);
        students.put("Martin", 5);
        students.put("Daniel", 5);

        /*начин за принтиране на стойностите (values) чрез .stream*/
        students.values().stream().forEach(System.out::println);

        System.out.println("*****");  // <- просто разделител.

        /*начин за принтиране само на ключовете (keys) чрез .stream*/
        students.keySet().stream().forEach(System.out::println);

        System.out.println("*****");

        /*принтиране на ключове и стойности (keys and values), чрез .stream. entrySet минава през всички ключове и техните стойности*/
        students.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        System.out.println("******");

        /*сравняване по стойност и ако стойностите са равни, по ключове*/
        students.entrySet().stream()
                .sorted((n1, n2) -> {
                            int result = n2.getValue().compareTo(n1.getValue()); //сравнява стойностите (оценките) от най-голямата към най малката.
                            if (result == 0) {               // ако стойностите са равни (еднакви)
                                result = n1.getKey().compareTo(n2.getKey());  // сравняваме по ключове (имена) в низходящ ред.
                            }
                            return result;
                        }
                )
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));


        System.out.println("****");

        /* Или с по прост метод*/
        students.entrySet().stream()
                .sorted((n1,n2) -> n2.getValue().compareTo(n1.getValue()))
                // или
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }
}
