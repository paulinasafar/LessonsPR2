package at.campus02.emp;

import java.util.Arrays;

public class DemoEmp {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "John Brown", 2122.22, "Sales");
        Employee emp2 = new Employee(2, "Martina Weiss", 2532.24, "IT");
        Employee emp3 = new Employee(3, "Laura Schwarz", 2879.65, "IT");
        Employee emp4 = new Employee(4, "Franz Kohl", 1882.21, "Sales");
        Employee emp5 = new Employee(5, "Johann Buber", 1982.11, "Finance");
        Employee emp6 = new Employee(6, "Melissa Rot", 2355.21, "Finance");



        EmployeeManager empm1 = new EmployeeManager();

        empm1.addEmployee(emp1);
        empm1.addEmployee(emp2);
        empm1.addEmployee(emp3);
        empm1.addEmployee(emp4);
        empm1.addEmployee(emp5);
        empm1.addEmployee(emp6);

        System.out.println(empm1.findByEmpNumber(5));
        System.out.println();
        System.out.println(empm1.findByDepartment("IT"));
        System.out.println();
        System.out.println(empm1.findByMaxSalary());


    }
}
