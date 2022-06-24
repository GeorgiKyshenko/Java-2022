package _11_ExamPrep03;

import java.util.*;

public class AutumnCocktails_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> ingredientsQue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .forEach(ingredientsQue::offer);

        ArrayDeque<Integer> freshnessStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .forEach(freshnessStack::push);

        Map<String, Integer> allCocktails = new TreeMap<>();

        allCocktails.put("Pear Sour", 0);
        allCocktails.put("The Harvest", 0);
        allCocktails.put("Apple Hinny", 0);
        allCocktails.put("High Fashion", 0);


        while (!ingredientsQue.isEmpty() && !freshnessStack.isEmpty()) {

            if (ingredientsQue.peek() == 0) {
                ingredientsQue.poll();
                continue;
            }
            int sum = ingredientsQue.peek() * freshnessStack.peek();
            String cocktail = null;

            switch (sum) {
                case 150:
                    cocktail = "Pear Sour";
                    ingredientsQue.poll();
                    freshnessStack.pop();
                    break;
                case 250:
                    cocktail = "The Harvest";
                    ingredientsQue.poll();
                    freshnessStack.pop();
                    break;
                case 300:
                    cocktail = "Apple Hinny";
                    ingredientsQue.poll();
                    freshnessStack.pop();
                    break;
                case 400:
                    cocktail = "High Fashion";
                    ingredientsQue.poll();
                    freshnessStack.pop();
                    break;
                default:
                    int ingredientValue = ingredientsQue.poll();
                    ingredientsQue.offer(ingredientValue + 5);
                    freshnessStack.pop();
                    break;
            }

            if (cocktail != null) {
                int newVal = allCocktails.get(cocktail) + 1;
                allCocktails.put(cocktail, newVal);
            }
        }
        boolean atLeastOne = allCocktails.entrySet().stream().allMatch(el -> el.getValue() > 0);

        if (atLeastOne) {
            System.out.println("It's party time! The cocktails are ready!");
            allCocktails.forEach((k, v) -> System.out.printf("# %s --> %d%n", k, v));
        } else {
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");

            if(!ingredientsQue.isEmpty()) {
                int sum = ingredientsQue.stream().mapToInt(e -> e).sum();
                System.out.println("Ingredients left: " + sum);
            }
            allCocktails.entrySet().stream().filter(el -> el.getValue() > 0)
                    .forEach(el -> System.out.printf("# %s --> %d%n", el.getKey(), el.getValue()));
        }
    }
}
