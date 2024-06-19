package javalearn.basics;

import java.util.Arrays;
import java.util.List;

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

public class StreamExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 6000),
                new Employee("Bob", "HR", 5000),
                new Employee("Charlie", "IT", 7000),
                new Employee("David", "Finance", 5500)
        );

        double averageITSalary = employees.stream()
                .filter(emp -> emp.getSalary()>5500)
                .mapToDouble(Employee::getSalary).average().orElse(0.0);

        System.out.println("Average IT salary: " + averageITSalary);
    }
}
