package at.campus02.emp;

import java.lang.reflect.Array;
import java.util.*;

public class EmployeeManager {

    private List<Employee> employees;


    public EmployeeManager() {
        this.employees = new ArrayList<Employee>();
    }


    public void addEmployee(Employee emp1) {
        employees.add(emp1);
    }

    public Employee findByEmpNumber(int number) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmpNumber() == number) {
                return employees.get(i);
            }
        }
        return null;
    }

    public ArrayList<Employee> findByDepartment(String department) {
        ArrayList<Employee> employees2 = new ArrayList<Employee>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getDepartment().equals(department)) {
                employees2.add(employees.get(i));
            }
        }
        return employees2;
    }

    public Employee findByMaxSalary() {

        Employee emp = employees.get(0);
        for (int i = 0; i < employees.size(); i++) {
            if (emp.getSalary() < employees.get(i).getSalary()) {
                emp = employees.get(i);
            }
        }
        return emp;
    }

}

