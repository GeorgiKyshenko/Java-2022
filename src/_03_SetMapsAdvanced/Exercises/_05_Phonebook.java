package _03_SetMapsAdvanced.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _05_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phoneNumbers = new LinkedHashMap<>();
        String command = scanner.nextLine();

        while (!command.equals("search")) {
            String[] data = command.split("-");
            phoneNumbers.put(data[0], data[1]);
            command = scanner.nextLine();
        }

        String name = scanner.nextLine();
        while (!name.equals("stop")) {
            /*if (command.equals("search")) { мой вариант ако продължа да използвам command вместо name.
                command = scanner.nextLine();
            }*/
            if (phoneNumbers.containsKey(name)) {
                System.out.println(name + " -> " + phoneNumbers.get(name));
            } else {
                System.out.printf("Contact %s does not exist.%n", name);
            }
            name = scanner.nextLine();
        }
    }
}
