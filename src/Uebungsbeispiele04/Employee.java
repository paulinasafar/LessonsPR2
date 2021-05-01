package Uebungsbeispiele04;

public class Employee {

    protected String lastname;
    protected String firstname;
    protected String department;
    protected double baseSalary;

    public Employee(String firstname, String lastname, String department, double baseSalary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = department;
        this.baseSalary = baseSalary;
    }

    public double getFullSalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return "Employee{: " +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", department='" + department + '\'' +
                ", baseSalary=" + baseSalary;
    }
}
