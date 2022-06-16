package _06_FunctionalProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        Collections.addAll(myList,"1","2","3","4","5");

        Function<String, Integer> func = e -> Integer.parseInt(e);
        //Функциите могат да бъдат използвани в stream. func приема String и връща Integer.

        myList.stream()
                .map(func)
                .forEach(el-> System.out.println(el));
    }
}
