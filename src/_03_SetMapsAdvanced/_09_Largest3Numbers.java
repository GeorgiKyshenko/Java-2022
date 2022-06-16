package _03_SetMapsAdvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _09_Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    /*    List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+")).map(Integer::parseInt)
                .sorted((n1,n2)-> n2.compareTo(n1))
                .limit(3)
                .collect(Collectors.toList());

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    */




        // и двата начина работят !

        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .sorted((n1,n2)-> n2.compareTo(n1))
                .limit(3)
                .forEach(el -> System.out.printf("%d ",el));


    }
}
