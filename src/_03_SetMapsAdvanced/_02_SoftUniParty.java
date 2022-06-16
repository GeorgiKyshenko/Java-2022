package _03_SetMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _02_SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Set<String> regular = new TreeSet<>();
        Set<String> vip = new TreeSet<>();


        while (!line.equals("PARTY")) {
            char ch = line.charAt(0);
            if (Character.isLetter(ch)) {
                regular.add(line);
            } else if (Character.isDigit(ch)) {
                vip.add(line);
            }
            line = scanner.nextLine();
        }
        while (!line.equals("END")) {
            if(regular.contains(line)){
                regular.remove(line);
            } else {
                vip.remove(line);
            }
            line = scanner.nextLine();
        }

        System.out.println(regular.size() + vip.size());
        for (String n : vip) {
            System.out.println(n);
        }
        for (String s : regular) {
            System.out.println(s);
        }
    }
}
