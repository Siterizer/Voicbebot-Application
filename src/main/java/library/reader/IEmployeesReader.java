package library.reader;

import library.entity.Employees;


public interface IEmployeesReader {

    Employees readEmployee(String path);
}
