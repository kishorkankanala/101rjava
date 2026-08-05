package com.inheritance;
class Employee{
	String name;
	double basesalary;
	public Employee(String name, double basesalary) {
		super();
		this.name = name;
		this.basesalary = basesalary;
	}
	double calculateAnnualSalary() {
        return basesalary;
    }
}
//derived class
class Manager extends Employee{
	double bonus;
	int numberofemployeesmanaged;
	public Manager(String name, double basesalary, double bonus, int numberofemployeesmanaged) {
		super(name, basesalary);
		this.bonus = bonus;
		this.numberofemployeesmanaged = numberofemployeesmanaged;
	}
	double calculateManagerSalary() {
	    return basesalary + bonus;
	}	
}
// derived engineer class
class Engineer extends Employee{
	double projectcount;

	
	public Engineer(String name, double basesalary, double projectcount) {
		super(name, basesalary);
		this.projectcount = projectcount;
	}


		double calculateEngineerSalary() {
		    return basesalary + (projectcount * 1000);
		}
		
	}

// sales person
class Salesperson extends Employee{
	double comissionrate;
	double totalsales;
	
	
	public Salesperson(String name, double basesalary, double comissionrate, double totalsales) {
		super(name, basesalary);
		this.comissionrate = comissionrate;
		this.totalsales = totalsales;
	
	}
	double calculateSalespersonSalary() {
		return basesalary + (comissionrate * totalsales);
	}
}
public class EmployeeHierarchy  {
public static void main(String []args) {

	    // Manager
	    Employee manager = new Manager("Alice", 50000, 10000, 5);
	    System.out.println(manager.calculateAnnualSalary());
	    System.out.println(((Manager) manager).calculateManagerSalary());

	    System.out.println();

	    // Engineer
	    Employee engineer = new Engineer("Bob", 70000, 5);
	    System.out.println(engineer.calculateAnnualSalary());
	    System.out.println(((Engineer) engineer).calculateEngineerSalary());

	    System.out.println();

	    // Salesperson
	    Employee salesperson = new Salesperson("Charlie", 40000, 0.1, 200000);
	    System.out.println(salesperson.calculateAnnualSalary());
	    System.out.println(((Salesperson) salesperson).calculateSalespersonSalary());
	}
}
