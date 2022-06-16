package _01_StackAndQueues;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecimalToBinaryWithLIST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimal = Integer.parseInt(scanner.nextLine());
        List<Integer> stack = new ArrayList<>();
        if (decimal == 0) {
            System.out.println(0);
        } else {

            while (decimal != 0) {
                int leftover = decimal % 2;
                stack.add(leftover);
                decimal = decimal / 2;
            }
        }
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i));
        }
    }
}

