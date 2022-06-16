package _01_StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line  = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> childQue = new ArrayDeque<>();
        for (int i = 0; i < line.length; i++) {
            childQue.offer(line[i]);
        }
        while (childQue.size() != 1) {
            for (int i = 1; i < n; i++) {
                String child = childQue.poll();
                childQue.offer(child);
            }
            String removedChild = childQue.poll();
            System.out.println("Removed " + removedChild);
        }
        System.out.println("Last is " + childQue.peek());
    }
}
