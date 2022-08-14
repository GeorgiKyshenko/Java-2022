package _04_Tuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String first = input[0];
        String second = input[1];
        String address = input[2];
        Tuple<String, String> tuple = new Tuple<>(first + " " + second,address);
        System.out.println(tuple);

        input = scanner.nextLine().split(" ");
        String name = input[0];
        int litters = Integer.parseInt(input[1]);
        Tuple<String, Integer> tuple2 = new Tuple<>(name,litters);
        System.out.println(tuple2);

        input = scanner.nextLine().split(" ");
        int number = Integer.parseInt(input[0]);
        double number2 = Double.parseDouble(input[1]);
        Tuple<Integer,Double> tuple3 = new Tuple<>(number,number2);
        System.out.println(tuple3);

    }
}
