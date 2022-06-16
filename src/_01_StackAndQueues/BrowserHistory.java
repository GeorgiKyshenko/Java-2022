package _01_StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String currentURL = "";

        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        while (!input.equals("Home")) {
            if(input.equals("back")) {
                if(browserHistory.size() > 1) {
                    browserHistory.pop();
                    currentURL = browserHistory.peek();
                    System.out.println(currentURL);
                } else {
                    System.out.println("no previous URLs");
                }
            } else {
                browserHistory.push(input);
                currentURL = input;
                System.out.println(currentURL);
            }
            input = scanner.nextLine();
        }
    }
}
