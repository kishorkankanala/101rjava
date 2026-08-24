

 package com.inheritance;

class Department {
    String deptName;
    String location;

    public Department(String deptName, String location) {
        this.deptName = deptName;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Department [deptName=" + deptName +
                ", location=" + location + "]";
    }
}

class staff extends Department {
    int empId;
    String empName;
    double salary;

    public staff(String deptName, String location,
                    int empId, String empName, double salary) {
        super(deptName, location);
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEmployee [empId=" + empId +
                ", empName=" + empName +
                ", salary=" + salary + "]";
    }
}

public class Example4 {
	// Git test
    public static void main(String[] args) {

        staff emp = new staff(
                "IT",
                "Hyderabad",
                101,
                "Kishor",
                54000
        );

        System.out.println(emp);
    }
}
