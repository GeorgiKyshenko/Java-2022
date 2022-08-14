package _01_GenericBox_Task;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        Box<String> box = new Box<>();

        for (int i = 0; i < lines; i++) {
            String input = scanner.nextLine();
            box.add(input);
        }

        //input за swap метода(задача)
        int[] indices = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int index = indices[0];
        int replaceIndex = indices[1];

        box.swap(index, replaceIndex);
        System.out.println(box);

        // Input за compare метода (задача)
        String textToCompare = scanner.nextLine();
        System.out.println(box.countGreaterElements(textToCompare));
    }
}
