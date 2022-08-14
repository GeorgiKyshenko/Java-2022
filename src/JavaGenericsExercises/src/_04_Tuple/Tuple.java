package _04_Tuple;

public class Tuple<F, S> {
    F first;
    S second;

    public Tuple(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s", first, second);
    }
}
