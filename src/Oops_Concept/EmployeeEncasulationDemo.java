package Oops_Concept;

public class EmployeeEncasulationDemo {
   public  void main(String[] args) {
        EmployeeEncapsulation emp = new EmployeeEncapsulation();
        emp.setId(554);
        emp.setName("lakhendra");
        emp.setSalary(59999);
        EmployeeEncapsulation emp2 = new EmployeeEncapsulation();
        emp2.setId(234);
        emp2.setName("Sanjay");
        emp2.setSalary(73000.5);

        System.out.println("Employee Id:"+ emp.getId());
        System.out.println("Emplyee Nmae:"+emp.getName());
        System.out.println("salary :"+ emp.getSalary());
       System.out.println("Employee Id:"+ emp2.getId());
       System.out.println("Emplyee Nmae:"+emp2.getName());
       System.out.println("salary :"+ emp2.getSalary());
}}