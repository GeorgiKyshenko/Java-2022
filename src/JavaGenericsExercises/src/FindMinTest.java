import java.util.ArrayList;
import java.util.List;

public class FindMinTest {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(3);
        integerList.add(7);
        System.out.println(getMinInteger(integerList));

        System.out.println(findMin(integerList));


        List<String> stringList = new ArrayList<>();
        stringList.add("car");
        stringList.add("yellow");
        stringList.add("apple");
        System.out.println(getMinString(stringList));

        System.out.println(findMin(stringList));
    }


    public static <T extends Comparable<T>> T findMin(List<T> integerList) {
       T min = integerList.get(0);

        for (T element : integerList) {
            if (min.compareTo(element) > 0) {
                min = element;
            }
        }
        return min;
    }

    public static int getMinInteger(List<Integer> integerList) {
        Integer min = integerList.get(0);

        for (Integer element : integerList) {
            if (min.compareTo(element) > 0) {
                min = element;
            }
        }
        return min;
    }

    public static String getMinString(List<String> stringList) {
        String min = stringList.get(0);
        for (String element : stringList) {
            if (min.compareTo(element) > 0) {
                min = element;
            }
        }
        return min;
    }
}
