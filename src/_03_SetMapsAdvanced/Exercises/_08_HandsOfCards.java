package _03_SetMapsAdvanced.Exercises;

import java.util.*;

public class _08_HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Set<String>> players = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {
            String name = input.split(":\\s+")[0];
            String cards = input.split(":\\s+")[1];
            String[] card = cards.split(", ");

            /*
            if(!players.containsKey(name)) {
                players.put(name, new LinkedHashSet<>());
                for (int i = 0; i < card.length; i++) {
                    players.get(name).add(card[i]);
                }
            } else {
                for (int i = 0; i < card.length; i++) {
                    players.get(name).add(card[i]);
                }
            }
          Това е мой вариант на запълване на MAP-a с повече писане, но има много по практичен начин
          който ще направя.
             */
            Set<String> cardsSet = new LinkedHashSet<>(Arrays.asList(card));
            //Или cardsSet.addAll(Arrays.asList(card));
            if (!players.containsKey(name)) {
                players.put(name, cardsSet);
            } else {
                players.get(name).addAll(cardsSet);
            }
            input = scanner.nextLine();
        }
        players.entrySet().forEach(entry -> {
            String name = entry.getKey();
            int points = getCardsPoints(entry.getValue());
            System.out.printf("%s: %d%n", name, points);
        });
    }

    private static Map<Character, Integer> getSymbolValues() {
        Map<Character, Integer> characterValues = new LinkedHashMap<>();
        characterValues.put('2', 2);
        characterValues.put('3', 3);
        characterValues.put('4', 4);
        characterValues.put('5', 5);
        characterValues.put('6', 6);
        characterValues.put('7', 7);
        characterValues.put('8', 8);
        characterValues.put('9', 9);
        characterValues.put('J', 11);
        characterValues.put('Q', 12);
        characterValues.put('K', 13);
        characterValues.put('A', 14);
        characterValues.put('S', 4);
        characterValues.put('H', 3);
        characterValues.put('D', 2);
        characterValues.put('C', 1);
        return characterValues;
    }

    private static int getCardsPoints(Set<String> value) {
        Map<Character, Integer> symbolValues = getSymbolValues();
        int sum = 0;
        int points = 0;
        for (String card : value) {
            if (card.startsWith("10")) {
                char type = card.charAt(2);
                points = 10 * symbolValues.get(type);
            } else {
                char power = card.charAt(0);
                char type = card.charAt(1);
                points = symbolValues.get(power) * symbolValues.get(type);

            }
            sum += points;
        }
        return sum;
    }
}
