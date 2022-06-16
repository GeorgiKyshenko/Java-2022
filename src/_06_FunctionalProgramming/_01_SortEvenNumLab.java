package _06_FunctionalProgramming;

import java.util.*;
import java.util.stream.Collectors;

public class _01_SortEvenNumLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        List<Integer> list = Arrays.stream(numbers)
                .filter(el -> el % 2 == 0)
                .boxed().toList();

        List<String> strings = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            strings.add(list.get(i).toString());
        }
        System.out.print(String.join(", ",strings));
        System.out.println();
        //Collections.sort(list, (left,right) -> left.compareTo(right));

        strings = strings.stream()
                .map(e->Integer.parseInt(e))
                .sorted((a1,a2) -> a1.compareTo(a2))
                .map(e -> e.toString())
                .collect(Collectors.toList());

        System.out.print(String.join(", ",strings));

    }
}
