package _03_SetMapsAdvanced.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _06_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> emailsData = new LinkedHashMap<>();

        String name = scanner.nextLine();

        while (!name.equals("stop")) {
            String email = scanner.nextLine();
            if(!email.endsWith("uk") && !email.endsWith("us") && !email.endsWith("com")) {
                emailsData.put(name, email);
            }
            name = scanner.nextLine();
        }
        emailsData.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
