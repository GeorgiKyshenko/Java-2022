package _03_SetMapsAdvanced;

import java.util.*;

public class Lecture {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);

        mySet.remove(2);
        System.out.println(mySet);

        System.out.println("Georgi".hashCode());   // <- хеш кода на този стринг в паметта на компютъра.
    }
}
