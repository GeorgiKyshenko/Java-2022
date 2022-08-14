package _01_GenericBox_Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        values.add(element);
    }

    public void swap(int index, int replaceIndex) {
       // Collections.swap(values, index, replaceIndex);
        //или
        T temp = values.get(index);
        values.set(index, values.get(replaceIndex));
        values.set(replaceIndex, temp);

        /*това е на принципа
         * int a = 5;
         * int b = 10;
         * int temp = a;
         * int a = b
         * int b = temp*/

    }

    public long countGreaterElements (T element) {
        return values.stream().filter(el -> el.compareTo(element) > 0).count();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T value : values) {
            sb.append(String.format("%s: %s%n", value.getClass().getName(), value));
        }
        return sb.toString();
    }
}
