import java.util.Scanner;

public class IntArrayToStringArrayWithStringJoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] array = new int[n];
        String[] stringArray = new String[array.length];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = String.valueOf(array[i]);
        }

        System.out.println(String.join(", ",stringArray));

    }
}
