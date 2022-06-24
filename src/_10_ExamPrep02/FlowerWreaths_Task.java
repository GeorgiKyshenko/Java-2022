package _10_ExamPrep02;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FlowerWreaths_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> liliesStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt)
                .forEach(liliesStack::push);

        ArrayDeque<Integer> rosesQue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt)
                .forEach(rosesQue::offer);

        int wreaths = 0;
        int otherFlowers = 0;

        while (!liliesStack.isEmpty() && !rosesQue.isEmpty()) {
            int lily = liliesStack.pop();
            int rose = rosesQue.poll();

            int sum = lily + rose;

            while (sum > 15) {
                lily -= 2;
                sum = lily + rose;
            }
            if (sum == 15) {
                wreaths++;
            } else {
                otherFlowers += sum;
            }
        }

        int leftFlowers = otherFlowers / 15;
        wreaths += leftFlowers;

        if(wreaths >= 5) {
            System.out.printf("You made it, you are going to the competition with %d wreaths!",wreaths);
        } else {
            System.out.printf("You didn't make it, you need %d wreaths more!",5 - wreaths);
        }

    }
}
