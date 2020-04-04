package library.service;

import library.entity.Employee;
import library.entity.Employees;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EmployeesSalarySumTest {

    private static Employees employees;

    @BeforeClass
    public static void init()
    {
        employees = new Employees(new ArrayList<>());
    }
    @Before
    public void clearLists(){
        employees.getEmployees().clear();
    }

    @Test
    public void testPositiveSalary() {
        List<Employee> list = employees.getEmployees();
        list.add(new Employee(Long.parseLong("1"), "1", "1", "Job", "250.0"));
        list.add(new Employee(Long.parseLong("1"), "1", "1", "Job", "250.0"));
        list.add(new Employee(Long.parseLong("1"), "1", "1", "Job", "-250.0"));
        assertEquals("250.0", EmployeesSalarySum.sumSalaryByJob(employees).get("Job").toString());
    }

    @Test
    public void testNegativeSalary() {
        List<Employee> list = employees.getEmployees();
        list.add(new Employee(Long.parseLong("1"), "1", "1", "Job", "250.0"));
        list.add(new Employee(Long.parseLong("1"), "1", "1", "Job", "-250.0"));
        list.add(new Employee(Long.parseLong("1"), "1", "1", "Job", "-250.0"));
        assertEquals("-250.0", EmployeesSalarySum.sumSalaryByJob(employees).get("Job").toString());
    }

    @Test
    public void testDecimalSalary() {
        List<Employee> list = employees.getEmployees();
        list.add(new Employee(Long.parseLong("1"), "1", "1", "Job", "250.99"));
        list.add(new Employee(Long.parseLong("1"), "1", "1", "Job", "250.1"));
        list.add(new Employee(Long.parseLong("1"), "1", "1", "Job", "250.2"));
        assertEquals("751.29", EmployeesSalarySum.sumSalaryByJob(employees).get("Job").toString());
    }

    @Test
    public void testSmallSalary() {
        List<Employee> list = employees.getEmployees();
        list.add(new Employee(Long.parseLong("1"), "1", "1", "Job", "0.51"));
        list.add(new Employee(Long.parseLong("1"), "1", "1", "Job", "0.01"));
        assertEquals("0.52", EmployeesSalarySum.sumSalaryByJob(employees).get("Job").toString());
    }

    @Test
    public void testBigSalary() {
        List<Employee> list = employees.getEmployees();
        list.add(new Employee(Long.parseLong("1"), "1", "1", "Job", "2500000"));
        list.add(new Employee(Long.parseLong("1"), "1", "1", "Job", "25000000"));
        assertEquals("27500000", EmployeesSalarySum.sumSalaryByJob(employees).get("Job").toString());
    }
}