package _06_FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerSupplierPredicate {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        //1. Consumer.
        Consumer<Integer> printer = e -> System.out.println(e); // не връща никаква стойност, метода му е void.
        list.forEach(printer);
        printer.accept(12); // метода на Consumer e accept на Function е apply.

        //2.Supplier.
        Supplier<Integer> genRandomInt = () -> new Random().nextInt(51);
        //Supplier не приема никакви стойности, но връща няккава.
        //метода му е ->
        int rnd = genRandomInt.get(); // взима random число до 51.
        System.out.println(rnd);

        //3.Predicate
        Predicate<Integer> checkIfEven = el -> el % 2 == 0; //приема даден тип данни и връща boolean.
        boolean check = checkIfEven.test(10);
        System.out.println(check);
    }
}
