package _01_StackAndQueues.Exercises;

public class StringBuilderDeleteElements {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("abcd");

        for (int i = text.length() - 1; i >= 2 ; i--) {
            text.deleteCharAt(i);
        }
        System.out.println(text);
    }
}
