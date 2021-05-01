package Uebungsbeispiele04;

public class EmployeeApp {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Mimi", "Mustermann", "CEO", 12356.25);
        FixComissionEmployee fix1 = new FixComissionEmployee("John", "Kendrick", "Sales", 5687.52, 1258.24);
        FixComissionEmployee fix2 = new FixComissionEmployee("Franzl", "Weiss", "IT", 3412.78,678.97);
        FixComissionEmployee fix3 = new FixComissionEmployee("Martina", "Schwarz", "Sales", 4563.65, 1567.17);

        PercentComissionEmployee perc1 = new PercentComissionEmployee("Bobi", "Bob", "Finance", 5588.65);
        PercentComissionEmployee perc2 = new PercentComissionEmployee("Rudi", "Blabla", "Admin", 3158.65);
        PercentComissionEmployee perc3 = new PercentComissionEmployee("Laura", "Schuld", "IT", 9868.65);
        PercentComissionEmployee perc4 = new PercentComissionEmployee("Anna", "Zeile", "IT", 4799.65);

        EmployeeManager employees1 = new EmployeeManager();
        employees1.addEmployee(fix1);
        employees1.addEmployee(fix2);
        employees1.addEmployee(fix3);
        employees1.addEmployee(perc1);
        employees1.addEmployee(perc2);
        employees1.addEmployee(perc3);
        employees1.addEmployee(emp1);

        System.out.println();
        System.out.println(fix1.getFullSalary());
        System.out.println(fix3.getFullSalary());
        System.out.println(perc2.getFullSalary());
        System.out.println(perc4.getFullSalary());


        System.out.println(employees1);
        System.out.println("Total Salary: " + employees1.calcTotalSalary());

        System.out.println();
        System.out.println(employees1.getSalaryByDepartment());



    }

}
