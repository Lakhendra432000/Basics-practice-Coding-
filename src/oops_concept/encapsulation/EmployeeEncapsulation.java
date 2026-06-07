package oops_concept.encapsulation;

public class EmployeeEncapsulation {

        private int id;
        private String name;
        private  double salary;

        public int getId() {

            return id;
        }
        public void setId(int id) {

            if (id > 0) {
                this.id = id;
            } else {
                System.out.println("invalid Id");
            }
        }

        public String getName(){
                return name;
            }

        public void setName(String name){
                this.name = name;
            }

        public double getSalary(){
                return salary;
            }

        public void setSalary(double salary){
            if(salary > 0){
                this.salary = salary;
            }
            else {
                System.out.println("invalid salary");
            }
    }

}
