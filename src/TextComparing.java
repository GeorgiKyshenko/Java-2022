import java.util.*;
import java.util.stream.Collectors;

public class TextComparing {
    //@SuppressWarnings("InfiniteLoopStatement") -- this won`t warn you if you make infinite while loop;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "hello";
        String s1 = new String("hello");  //ако създадем new String s==s1 e false, ако премахнем new String s==s1 e true;
        String s2 = scanner.nextLine();

        System.out.println(s == s1);
        System.out.println(s == s2);

    }
}
