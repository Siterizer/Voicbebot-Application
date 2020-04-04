package library.reader;

import library.entity.Employee;

import java.util.List;


public interface EmployeeReader {

    public List<Employee> readEmployee(String url);
}
