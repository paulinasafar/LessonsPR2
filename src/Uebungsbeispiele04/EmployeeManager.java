package Uebungsbeispiele04;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {

    protected ArrayList<Employee> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    public double calcTotalSalary() {
        double totalSalary = 0.0;
        for (Employee e : employees) {
            totalSalary += e.getFullSalary();
        }
    return totalSalary;}

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public HashMap<String, Double> getSalaryByDepartment() {
            HashMap<String, Double> byDepartment = new HashMap<>();
        for (int i = 0; i < employees.size(); i++) {

            switch(employees.get(i).department) {
                case "Sales":
                    byDepartment.put(employees.get(i).department, byDepartment.getOrDefault(employees.get(i).department, 0.0) + employees.get(i).getFullSalary());
                    break;
                case "IT":
                    byDepartment.put(employees.get(i).department, byDepartment.getOrDefault(employees.get(i).department, 0.0) + employees.get(i).getFullSalary());
                    break;
                case "Admin":
                    byDepartment.put(employees.get(i).department, byDepartment.getOrDefault(employees.get(i).department, 0.0) + employees.get(i).getFullSalary());
                    break;
                case "Finance":
                    byDepartment.put(employees.get(i).department, byDepartment.getOrDefault(employees.get(i).department, 0.0) + employees.get(i).getFullSalary());
                    break;
            }
        }
        return byDepartment;
    }

    @Override
    public String toString() {
        return "EmployeeManager{" +
                "employees=" + employees +
                '}';
    }
}
