package Oops_Concept;

public class StudentEncapsulationDemo {
    public static void main(String[] args) {

        StudentEncapsulation st = new StudentEncapsulation();
        st.setRollNumber(625);
        st.setName("lucky kumar");
        st.setMarks(73);

        System.out.println("Students details");
        System.out.println("Student RollNumber:"+ st.getRollNumber());
        System.out.println("Student Name:"+ st.getName());
        System.out.println("Obtained Marks:"+st.getMarks());

    }
}
