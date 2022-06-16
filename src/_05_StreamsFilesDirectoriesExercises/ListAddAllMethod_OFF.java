package _05_StreamsFilesDirectoriesExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListAddAllMethod_OFF {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));
        list.add("5");
        list.addAll(Arrays.asList("6", "7", "8"));
        // или
        Collections.addAll(list, "6", "7", "8");
        System.out.println(list);

    }
}
