package _09_ExamPrep01;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cooking_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> queLiquids = new ArrayDeque();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(queLiquids::offer);

        ArrayDeque<Integer> stackIngredients = new ArrayDeque();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(stackIngredients::push);

        Map<String, Integer> cookedFoods = new TreeMap();
        cookedFoods.put("Bread", 0);
        cookedFoods.put("Cake", 0);
        cookedFoods.put("Pastry", 0);
        cookedFoods.put("Fruit Pie", 0);

        String cookedFood;
        while (!queLiquids.isEmpty() && !stackIngredients.isEmpty()) {
            int lastIngredient = stackIngredients.pop();
            int sum = queLiquids.poll() + lastIngredient;
            switch (sum) {
                case 25:
                    cookedFood = "Bread";
                    break;
                case 50:
                    cookedFood = "Cake";
                    break;
                case 75:
                    cookedFood = "Pastry";
                    break;
                case 100:
                    cookedFood = "Fruit Pie";
                    break;
                default:
                    cookedFood = null;
            }

            if (cookedFood != null) {
                int newVal = cookedFoods.get(cookedFood) + 1;
                cookedFoods.put(cookedFood, newVal);
            } else {
                stackIngredients.push(lastIngredient + 3);
            }
        }

        boolean allFoodsAreCooked = cookedFoods.entrySet().stream().allMatch((e) -> e.getValue() > 0);

        if (allFoodsAreCooked) {
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        } else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to cook everything.");
        }

        String remainingLiquids = queLiquids.isEmpty() ? "none" : (String) queLiquids.stream().map(String::valueOf).collect(Collectors.joining(", "));
        System.out.println("Liquids left: " + remainingLiquids);

        cookedFood = stackIngredients.isEmpty() ? "none" : (String) stackIngredients.stream().map(String::valueOf).collect(Collectors.joining(", "));
        System.out.println("Ingredients left: " + cookedFood);

        cookedFoods.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    }
}

