package _02_GenericCount_Task;

import _01_GenericBox_Task.Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        UserClass<String> userClass = new UserClass<>();

        for (int i = 0; i < lines; i++) {
            String input = scanner.nextLine();
            userClass.add(input);
        }

        String textToCompare = scanner.nextLine();
        System.out.println(userClass.countGreaterElements(textToCompare));
    }
}
