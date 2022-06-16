package _03_SetMapsAdvanced.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Map<String, String> names = new LinkedHashMap<>();

        while (!input[0].equals("end")) {
            String key = input[0];
            String value = input[1];
            names.put(key, value);
            input = scanner.nextLine().split(" ");
        }
        for (int i = 0; i < 3; i++) {
            names.remove(names);
        }

        for (int i = 0; i < 1; i++) {
            System.out.println(names);
        }
    }
}
