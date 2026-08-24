package test;

public class Employee {

    int empId;
    String name;
    String designation;
    double salary;
    int performanceRating;

    public Employee(int empId, String name, String designation, double salary, int performanceRating) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.performanceRating = performanceRating;
    }

    public void promoteEmployee() {
        if (performanceRating >= 4) {
            salary = salary + (salary * 20 / 100);
            designation = "Senior " + designation;
            System.out.println("Employee Promoted");
        } else {
            System.out.println("No Promotion");
        }
    }
}