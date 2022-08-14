package _02_GenericCount_Task;

import java.util.ArrayList;
import java.util.List;

public class UserClass<T extends Comparable<T>> {
    private List<T> values;

    public UserClass() {
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        values.add(element);
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
