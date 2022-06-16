package _03_SetMapsAdvanced.Exercises;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class _09_UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        TreeMap<String, LinkedHashMap<String, Integer>> data = new TreeMap<>();

        while (!input.equals("end")) {
            String[] inputData = input.split(" ");
            String ip = inputData[0].split("=")[1];
            //String message = inputData[1].split("=")[1];
            String username = inputData[2].split("=")[1];

            if (!data.containsKey(username)) {
                data.put(username, new LinkedHashMap<>());
                data.get(username).put(ip, 1);
            } else {
                if (data.get(username).containsKey(ip)) {
                    data.get(username).put(ip, data.get(username).get(ip) + 1);
                } else {
                    data.get(username).put(ip, 1);
                }
            }
            input = scanner.nextLine();
        }
        data.keySet().forEach(username -> {
            System.out.println(username + ": ");
            int count = 0;
            for (String n : data.get(username).keySet()) {
                count++;
                System.out.print(n + " => " + data.get(username).get(n));
                if(count == data.get(username).values().size()) {
                    System.out.println(".");
                } else {
                    System.out.print(", ");
                }

            }
        });
    }
}
