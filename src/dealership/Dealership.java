package dealership;

import java.util.ArrayList;
import java.util.Collection;


public class Dealership {
    public Collection<Car> cars;
    public String name;
    public int capacity;

    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.cars = new ArrayList<>();
    }

    public void add(Car car) {
        if (cars.size() < capacity) {
            cars.add(car);
        }
    }

    public boolean buy(String manufacturer, String model) {
        return cars.removeIf(car -> car.getManufacturer().equals(manufacturer) && car.getModel().equals(model));
    }

    public Car getLatestCar() {
        Car car = null;
        int latestYear = Integer.MIN_VALUE;
        for (Car currentCar : this.cars) {
            if (currentCar.getYear() > latestYear) {
                latestYear = currentCar.getYear();
                car = currentCar;
            }
        }
        return car;
    }

    public Car getCar(String manufacturer, String model) {
        return this.cars.stream().filter(car -> car.getManufacturer().equals(manufacturer) && car.getModel().equals(model))
                .findFirst().orElse(null);
    }

    public int getCount() {
        return cars.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("The cars are in a car dealership %s:%n", this.name));

        for (Car car : this.cars) {
            sb.append(car.toString()).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
