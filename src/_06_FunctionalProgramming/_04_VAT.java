package _06_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class _04_VAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] prices = scanner.nextLine().split(", ");

        Function<String, Double> parser = e -> Double.parseDouble(e);
        Consumer<Double> printer = e -> System.out.printf("%.2f%n", e);
        Function<Double, Double> addVat = e -> e * 1.2;

        /*UnaryOperator<Double> addVat = e-> e*1.2;
         * съдържа Function в него и работи по същият начин, използва се,когато се приема
         * един тип данни и се връща, същият тип*/


        System.out.println("Prices with VAT:");
        Arrays.stream(prices)
                .map(parser)
                .map(addVat)
                .forEach(printer);

    }
}