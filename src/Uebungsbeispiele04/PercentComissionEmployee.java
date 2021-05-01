package Uebungsbeispiele04;

public class PercentComissionEmployee extends Employee {

    protected double percentComission;

    public PercentComissionEmployee(String lastname, String firstname, String department, double baseSalary) {
        super(lastname, firstname, department, baseSalary);
        this.percentComission = baseSalary * 0.1;
    }

    @Override
    public double getFullSalary() {
        return baseSalary + percentComission;
    }
}
