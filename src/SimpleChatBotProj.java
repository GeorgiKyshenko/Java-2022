import java.util.Scanner;

public class SimpleChatBotProj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Simon.");
        System.out.println("I was created in 2022.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int remainder3 = Integer.parseInt(scanner.nextLine());
        int remainder5 = Integer.parseInt(scanner.nextLine());
        int remainder7 = Integer.parseInt(scanner.nextLine());

        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.printf("Your age is %d; that's a good time to start programming!%n", age);
        System.out.println("Now I will prove to you that I can count to any number you want.");

        int numbersToCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= numbersToCount; i++) {
            System.out.println(i + "!");
        }

        System.out.println("Let's test your programming knowledge.");

        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        int guessNumber = scanner.nextInt();
        while (guessNumber != 1) {
            System.out.println("Please, try again.");
            guessNumber = scanner.nextInt();
        }
        System.out.println("Congratulations, have a nice day!");
    }
}
