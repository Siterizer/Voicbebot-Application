package library.reader;

import library.entity.Employee;
import library.entity.Employees;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.*;

public class JSONReaderTest {

    private static Employees employees;

    @BeforeClass
    public static void init()
    {
        IEmployeesReader reader = new JSONReader();
        employees = reader.readEmployee("src/test/resources/employeesTest.json");
    }

    @Test
    public void testFirstEmployee() {
        Employee employee = employees.getEmployees().get(0);
        assertEquals("1", String.valueOf(employee.getId()));
        assertEquals("Adam", employee.getName());
        assertEquals("Macura", employee.getSurname());
        assertEquals("Junior-Java-Programmer", employee.getJob());
        assertEquals("2500.0", employee.getSalary());
    }

    @Test
    public void testSecondEmployee() {
        Employee employee = employees.getEmployees().get(1);
        assertEquals("2", String.valueOf(employee.getId()));
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", employee.getName());
        assertEquals("23", employee.getSurname());
        assertEquals("", employee.getJob());
        assertEquals("-456,45", employee.getSalary());
    }
}