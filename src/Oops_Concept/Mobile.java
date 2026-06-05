package Oops_Concept;

public class Mobile {

    String brand;
    String model;
    double price;

    Mobile(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void display(){
        System.out.println("Brand Name:"+brand);
        System.out.println("Model Name:"+model);
        System.out.println("Woh Price:"+price);
    }

}
