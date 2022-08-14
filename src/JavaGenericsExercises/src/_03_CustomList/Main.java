package _03_CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomList<String> list = new CustomList<>();

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] inputParts = input.split(" ");
            String command = inputParts[0];

            switch (command) {
                case "Add":
                    String elementToAdd = inputParts[1];
                    list.add(elementToAdd);
                    break;
                case "Remove":
                    int removeIndex = Integer.parseInt(inputParts[1]);
                    list.remove(removeIndex);
                    break;
                case "Contains":
                    String elementToSearch = inputParts[1];
                    System.out.println(list.contains(elementToSearch));
                    break;
                case "Swap":
                    int index = Integer.parseInt(inputParts[1]);
                    int replaceIndex = Integer.parseInt(inputParts[2]);
                    list.swap(index, replaceIndex);
                    break;
                case "Greater":
                    String element = inputParts[1];
                    System.out.println(list.countGreaterThan(element));
                    break;
                case "Max":
                    System.out.println(list.max());
                    break;
                case "Min":
                    System.out.println(list.min());
                    break;
                case "Print":
                    System.out.println(list);
                    break;
                case "Sort":
                    Sorter.sort(list);
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println();
    }
}
