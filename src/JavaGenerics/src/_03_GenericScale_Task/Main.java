package _03_GenericScale_Task;

public class Main {
    public static void main(String[] args) {

        Scale<String> str = new Scale<>("A", "B");

        System.out.println(str.getHeavier());
    }
}
