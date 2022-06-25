package _12_LiveExam;

import java.util.*;

public class ItsChocolateTime_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Double> milkQue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+")).map(Double::parseDouble)
                .forEach(milkQue::offer);

        ArrayDeque<Double> cacaoStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+")).map(Double::parseDouble)
                .forEach(cacaoStack::push);

        Map<String, Integer> allChocolates = new TreeMap<>();


        allChocolates.put("Milk Chocolate", 0);
        allChocolates.put("Dark Chocolate", 0);
        allChocolates.put("Baking Chocolate", 0);

        while (!milkQue.isEmpty() && !cacaoStack.isEmpty()) {
            double milk = milkQue.peek();
            double cacao = cacaoStack.peek();
            double sum = Math.ceil(cacao / (milk + cacao) * 100);

            String chocolate = null;

            if (sum == 30.0) {
                chocolate = "Milk Chocolate";
                cacaoStack.pop();
                milkQue.poll();
            } else if (sum == 50.0) {
                chocolate = "Dark Chocolate";
                cacaoStack.pop();
                milkQue.poll();
            } else if (sum == 100.0) {
                chocolate = "Baking Chocolate";
                cacaoStack.pop();
                milkQue.poll();
            } else {
                cacaoStack.pop();
                double newVal = milkQue.poll();
                milkQue.offer(newVal + 10.0);

            }
            if (chocolate != null) {
                allChocolates.put(chocolate, allChocolates.get(chocolate) + 1);
            }
        }
        boolean atLeastOne = allChocolates.entrySet().stream().allMatch(el -> el.getValue() > 0);

        if (atLeastOne) {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
            allChocolates.forEach((k, v) -> System.out.printf("# %s --> %d%n", k, v));
        } else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
            allChocolates.entrySet().stream().filter(el -> el.getValue() > 0)
                    .forEach(el -> System.out.printf("# %s --> %d%n", el.getKey(), el.getValue()));

        }

    }
}
