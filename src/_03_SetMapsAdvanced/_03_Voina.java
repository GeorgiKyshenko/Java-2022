package _03_SetMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class _03_Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstPlayer = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> secondPlayer = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

            /* друг вариант е  да направим List - >

            List<Integer> firstPlayer = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

             Set<Integer> firstPlayerSet = new LinkedHashSet<>(firstPlayer); */

        for (int round = 0; round < 50; round++) {
            if (firstPlayer.isEmpty()) {
                System.out.println("Second player win!");
                return;
            }
            if (secondPlayer.isEmpty()) {
                System.out.println("First player win!");
                return;
            }
            int firstPlayerCard = firstPlayer.iterator().next(); //това върши същата работа като метода отдолу и е по практично.
            int secondPlayerCard = secondPlayer.iterator().next();

            firstPlayer.remove(firstPlayerCard);
            secondPlayer.remove(secondPlayerCard);

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayer.add(firstPlayerCard);
                firstPlayer.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayer.add(firstPlayerCard);
                secondPlayer.add(secondPlayerCard);
            } else {
                firstPlayer.add(firstPlayerCard);
                secondPlayer.add(secondPlayerCard);
            }
        }

        int firstPlayerDeckSize = firstPlayer.size();
        int secondPlayerDeckSize = secondPlayer.size();

        if (firstPlayerDeckSize > secondPlayerDeckSize) {
            System.out.println("First player win!");
        } else if (secondPlayerDeckSize > firstPlayerDeckSize) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }


    /*това е метод за итериране през LinkedHashSet за връщане на стойност, понеже няма имплементиран .get метод.
     * Метода минава през 1-вият елемент и веднага го връща като стойност*/
    private static Integer getTopValueFromPlayer(LinkedHashSet<Integer> player) {
        for (Integer card : player) {
            return card;
        }
        return 0;
    }
}
