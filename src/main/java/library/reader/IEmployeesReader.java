package library.reader;

import library.entity.Employees;


public interface IEmployeesReader {

    public Employees readEmployee(String path);
}
