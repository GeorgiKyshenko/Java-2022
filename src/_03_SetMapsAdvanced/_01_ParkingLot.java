package _03_SetMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _01_ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Set<String> parkingLot = new LinkedHashSet<>();

        while(!line.equals("END")) {
            String[] command = line.split(", ");
            if(command[0].equals("IN")) {
                parkingLot.add(command[1]);
            } else {
                parkingLot.remove(command[1]);
            }
            line = scanner.nextLine();
        }
        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        }
        for (String carNumbers : parkingLot) {
            System.out.println(carNumbers);
        }
    }
}
