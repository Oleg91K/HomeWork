package homework5;

import java.util.Comparator;
import java.util.List;

public class EmployeeTask {
    public static void main(String[] args) {
        // Дописать метод employeeGenerator и
        // отсортировать его по:
        // имени
        // имени и зарплате
        // имени, зарплате, возрасту и компании
        List<Employee> employees = Employee.employeeGenerator(20);

        Comparator<Employee> nameComparator= new Employee.nameComparator();
        employees.sort(nameComparator);
        System.out.println(employees);

        Comparator<Employee> employeeNameSalaryComparator = new Employee.nameComparator()
                .thenComparing(new Employee.salaryComparator());
        employees.sort(employeeNameSalaryComparator);
        System.out.println(employees);

        Comparator<Employee> employeeNameSalaryAgeCompanyComparator = new Employee.nameComparator()
                .thenComparing(new Employee.salaryComparator())
                .thenComparing(new Employee.ageComparator())
                .thenComparing(new Employee.companyComparator());
        employees.sort(employeeNameSalaryAgeCompanyComparator);
        System.out.println(employees);






    }
}