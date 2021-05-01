package Uebungsbeispiele04;

public class FixComissionEmployee extends Employee{

    protected double additionalComission;

    public FixComissionEmployee(String firstname, String lastname, String department, double baseSalary, double additionalComission) {
        super(firstname, lastname, department, baseSalary);
        this.additionalComission = additionalComission;
    }

    @Override
    public double getFullSalary() {
        return baseSalary + additionalComission;
    }
}
