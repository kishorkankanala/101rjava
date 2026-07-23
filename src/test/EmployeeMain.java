package test;

public class EmployeeMain {

public static void main(String[] args) {

    Employee emp = new Employee(101, "Kishor", "Developer", 50000, 4);

    System.out.println("Before Promotion");
    System.out.println("Employee ID : " + emp.empId);
    System.out.println("Name : " + emp.name);
    System.out.println("Designation : " + emp.designation);
    System.out.println("Salary : " + emp.salary);
    System.out.println("Performance Rating : " + emp.performanceRating);

    System.out.println();

    emp.promoteEmployee();

    System.out.println();

    System.out.println("After Promotion");
    System.out.println("Employee ID : " + emp.empId);
    System.out.println("Name : " + emp.name);
    System.out.println("Designation : " + emp.designation);
    System.out.println("Salary : " + emp.salary);
    System.out.println("Performance Rating : " + emp.performanceRating);
}
}