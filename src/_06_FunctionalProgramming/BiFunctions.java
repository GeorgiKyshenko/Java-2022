package _06_FunctionalProgramming;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctions {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > b;   // true || false
        BiConsumer<String, Integer> biConsumer = (String name, Integer age) -> System.out.println(name + " " + age); //  void -> отпечатване
        BiFunction<Integer, Integer, String> biFunction = (x, y) -> "Sum is " + (x + y); //приема 2 Integer-ра и връща String.

        //! Bi функциите приемат по 2 типа данни и си извършват същите функции.
    }
}
