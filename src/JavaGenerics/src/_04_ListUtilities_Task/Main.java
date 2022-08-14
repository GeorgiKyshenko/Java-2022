package _04_ListUtilities_Task;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(13, 42, 9, 17, 63);

        System.out.println(ListUtils.getMin(numbers));
        System.out.println(ListUtils.getMax(numbers));

    }
}
