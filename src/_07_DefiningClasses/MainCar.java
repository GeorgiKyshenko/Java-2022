package _07_DefiningClasses;

import java.util.Scanner;

public class MainCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        while (n-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");

            String brand = data[0];

            Car myCar;
            if (data.length == 1) {
                myCar = new Car(brand);
            } else {
                String model = data[1];
                int horsePower = Integer.parseInt(data[2]);
                myCar = new Car(brand, model, horsePower);
            }


//            myCar.setBrand(brand);
//            myCar.setModel(model);
//            myCar.setHorsePower(horsePower);

            System.out.println(myCar.carInfo());
        }
    }
}
