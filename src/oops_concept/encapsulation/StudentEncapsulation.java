package oops_concept.encapsulation;

public class StudentEncapsulation {

    private int rollNumber;
    private String name;
    private double marks;

    public int getRollNumber(){
        return rollNumber;
    }
    public void setRollNumber(int rollNumber){
        if(rollNumber > 0 && rollNumber <= 500) {
            this.rollNumber = rollNumber;
        }
        else{
            System.out.println("invalid rollNumber");
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getMarks(){
        return marks;
    }
    public void setMarks(double marks){
        if(marks > 0 && marks < 100){
            this.marks = marks;
        }
        else{
            System.out.println("invalid marks");

        }
    }
}
