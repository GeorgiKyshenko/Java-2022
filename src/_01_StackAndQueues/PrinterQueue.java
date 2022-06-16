package _01_StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        ArrayDeque<String> docs = new ArrayDeque<>();

        while (!command.equals("print")) {
            if(!command.equals("cancel")) {
                docs.offer(command);
            }
            if(command.equals("cancel") && docs.isEmpty()) {
                System.out.println("Printer is on standby");
            } else if (command.equals("cancel")) {
                String canceled = docs.poll();
                System.out.println("Canceled " + canceled);
            }
            command = scanner.nextLine();
        }
        for (String n : docs) {
            System.out.println(n);
        }
    }
}
