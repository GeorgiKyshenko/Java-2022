package _03_SetMapsAdvanced;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(5);
        int i, r, n, y, h;
        i = 3;
        n = 4;
        r = 7;
        y = 6;
        h = 2;
        list.add(i);
        list.add(n);
        list.add(r);
        list.add(y);
        list.add(h);
        String s = list.toString();
        System.out.println(String.join("*",s));

        System.out.print(i + " ");
        System.out.println(n);
        System.out.println(r + " " + y + " " + h);
        System.out.println(String.join("*",list.toString()));


    }
}
