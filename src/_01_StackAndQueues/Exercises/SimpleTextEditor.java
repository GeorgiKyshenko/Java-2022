package _01_StackAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operations = Integer.parseInt(scanner.nextLine());
        StringBuilder text = new StringBuilder();
        ArrayDeque<String> textStack = new ArrayDeque<>();

        for (int i = 0; i < operations; i++) {
            String command = scanner.nextLine();
            int commandNumber = Integer.parseInt(command.split("\\s+")[0]);

            switch (commandNumber) {
                case 1:
                    textStack.push(text.toString());
                    String stringToAppend = command.split("\\s+")[1];
                    text.append(stringToAppend);
                    break;
                case 2:
                    textStack.push(text.toString());
                    int elementToDelete = Integer.parseInt(command.split("\\s+")[1]);
                    text.delete(text.length() - elementToDelete, text.length() + 1);
                    break;
                case 3:
                    int index = Integer.parseInt(command.split("\\s+")[1]);
                    System.out.println(text.charAt(index - 1));
                    break;
                case 4:
                    if(!textStack.isEmpty()) {
                        text = new StringBuilder(textStack.pop());
                    }
                    break;
            }
        }
    }
}
