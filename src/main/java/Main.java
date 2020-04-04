import library.entities.Employee;
import library.entities.Employees;
import library.readers.CSVReader;
import library.readers.JSONReader;

import java.util.List;

public class Main {

    public static void main(String [] args){

        JSONReader jsonReader = new JSONReader();
        List<Employee> employees = jsonReader.readEmployee("src/main/resources/employees.json");
        for(Employee employee : employees){
            System.out.println(employee);
        }

        CSVReader csvReader = new CSVReader();
        List<Employee> employees2 = csvReader.readEmployee("src/main/resources/employees.csv");
        for(Employee employee : employees2){
            System.out.println(employee);
        }
    }
}
