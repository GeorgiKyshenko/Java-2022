package _06_FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _02_SumNumbersLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // 1-ви вариант с повече писане и логика.
        String[] numbers = scanner.nextLine().split(", ");

        int count = 0;
        int sum = 0;

        for (int i = 1; i <= numbers.length; i++) {
            count = i;
            sum += Integer.parseInt(numbers[i - 1]);
        }
        System.out.println("Count =  " + count);
        System.out.println("Sum = " + sum);

        //2-ри вариант.

        Function<String, Integer> parser = e ->Integer.parseInt(e);

        List<Integer> list = Arrays.stream(numbers)
                .map(parser)
                .collect(Collectors.toList());
        // .map стриймва референти типове (Integer,Double) и може да му зададеш .collect(Collectors.toList());
        // .mapToInt е стрийм на примитивни данни от тип int и можеш да му зададеш .toArray (.sum,.min,.max,.average, etc.)

        System.out.println("Count =  " + list.size());
        int sum2 = Arrays.stream(numbers).mapToInt(Integer::parseInt).sum();
        System.out.println("Sum = " + sum2);
    }
}
