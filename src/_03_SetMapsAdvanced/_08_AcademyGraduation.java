package _03_SetMapsAdvanced;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class _08_AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsCount = Integer.parseInt(scanner.nextLine());
        Map<String, double[]> students = new TreeMap<>();
        String name = "";
        for (int i = 0; i < studentsCount; i++) {
            name = scanner.nextLine();
            String[] scores = scanner.nextLine().split("\\s+");
            double[] arr = new double[scores.length];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Double.parseDouble(scores[j]);
            }
            students.put(name, arr);
        }
        Map<String, Double> newStudent = new TreeMap<>();
        String pattern = "#.###################################";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);


    }
}
