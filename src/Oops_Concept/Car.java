package Oops_Concept;

public class Car {
    String brand;
    String model;

    Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    void display() {
        System.out.println("Brand : "+ brand);
        System.out.println("Model : "+ model);
    }
}
