package oops_concept.class_object;

public class MobileDemo {
    static void main(String[] args) {
        Mobile mobile = new Mobile("Iphone","Sixteen pro", 50000);
        Mobile mobile1 = new Mobile("Motorolo", "Edge 60 pro", 30000);
        mobile1.display();
        mobile.display();
    }
}
