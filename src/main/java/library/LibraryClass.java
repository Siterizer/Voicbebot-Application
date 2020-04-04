package library;

import library.entity.Employees;
import library.reader.CSVReader;
import library.reader.IEmployeesReader;
import library.reader.JSONReader;
import library.service.EmployeesSalarySum;

import java.math.BigDecimal;
import java.util.HashMap;

public class LibraryClass {

    private EmployeesSalarySum calculate;

    public LibraryClass(){
        calculate = new EmployeesSalarySum();
    }

    public HashMap<String, BigDecimal> calculateSalaryFromPath(String path){

        IEmployeesReader reader;
        if(path.endsWith(".json")){
            reader = new JSONReader();
        } else if(path.endsWith(".csv")){
            reader = new CSVReader();
        } else {
            return null;
        }
        return calculate.sumSalaryByJob(reader.readEmployee(path));
    }
}
