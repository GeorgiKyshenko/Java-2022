package _07_DefiningClasses;

public class Car {

    private String brand;      //state - fields
    private String model;
    private int horsePower;

    public void start() {          // behavior
        System.out.println("Let`s ride!");

    }

    public Car(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }
    public Car(String brand) {
    this(brand,"unknown",-1);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(int horsePower) {
        if (horsePower > 0) {
            this.horsePower = horsePower;
        }
    }

    public String carInfo() {
        return String.format("The car is: %s %s - %d HP.", brand, model, horsePower);
    }

}
