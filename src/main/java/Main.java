import library.entity.Employee;
import library.reader.CSVReader;
import library.reader.JSONReader;
import library.service.EmployeesSalarySum;

import java.util.List;

public class Main {

    public static void main(String [] args){

        JSONReader jsonReader = new JSONReader();
        List<Employee> employees = jsonReader.readEmployee("src/main/resources/employees.json");
        
        System.out.println(EmployeesSalarySum.sumSalaryByJob(employees));
        CSVReader csvReader = new CSVReader();
        List<Employee> employees2 = csvReader.readEmployee("src/main/resources/employees.csv");

        System.out.println(EmployeesSalarySum.sumSalaryByJob(employees2));
    }
}
