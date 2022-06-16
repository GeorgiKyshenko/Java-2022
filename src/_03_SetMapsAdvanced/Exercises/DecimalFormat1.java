package _03_SetMapsAdvanced.Exercises;

import java.text.DecimalFormat;
import java.util.Arrays;

public class DecimalFormat1 {
    public static void main(String[] args) {

        double sum = (4.36 + 5.5 + 3.3 + 5.63 + 2.57 + 5.75 + 2.81 + 4.89);
        double result = sum / 8;
        String pattern = "#.###################################";
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat(pattern);
        System.out.printf("%s", decimalFormat.format(result));
    }
}
