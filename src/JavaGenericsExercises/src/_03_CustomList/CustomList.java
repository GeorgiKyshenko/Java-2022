package _03_CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> values;


    public CustomList() {
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        values.add(element);
    }

    public void remove(int index) {
        values.remove(index);
    }

    public boolean contains(T element) {
        return values.contains(element);
    }

    public void swap(int index, int replaceIndex) {
        Collections.swap(values, index, replaceIndex);
    }

    public int size() {
        return values.size();
    }

    public T get(int index) {
        return values.get(index);
    }

    public long countGreaterThan(T element) {
        return values.stream().filter(el -> el.compareTo(element) > 0).count();
    }

    public T max() {
        return values.stream().max(Comparable::compareTo).get();
    }

    public T min() {
        return values.stream().min(Comparable::compareTo).get();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T element : values) {
            sb.append(String.format("%s%n", element.toString()));

        }
        return sb.toString().trim();
    }
}
