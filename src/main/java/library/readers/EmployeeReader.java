package library.readers;

import library.entities.Employee;

import java.util.List;


public interface EmployeeReader {

    public List<Employee> readEmployee(String url);
}
