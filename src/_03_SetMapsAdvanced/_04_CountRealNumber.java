package _03_SetMapsAdvanced;

import java.util.*;

public class _04_CountRealNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] values = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> number = new LinkedHashMap<>();

        for (Double value : values) {
            if(!number.containsKey(value)) {
                number.put(value, 1);
            } else {
                number.put(value,number.get(value) + 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : number.entrySet()) {
            System.out.printf("%.1f -> %d%n",entry.getKey(), entry.getValue());
        }

    }
}
