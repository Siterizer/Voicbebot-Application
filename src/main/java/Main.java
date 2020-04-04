import library.entity.Employees;
import library.reader.CSVReader;
import library.reader.JSONReader;
import library.service.EmployeesSalarySum;


public class Main {

    public static void main(String [] args){

        JSONReader jsonReader = new JSONReader();
        Employees employees = jsonReader.readEmployee("src/main/resources/employees.json");

        System.out.println(EmployeesSalarySum.sumSalaryByJob(employees));
        CSVReader csvReader = new CSVReader();
        Employees employees2 = csvReader.readEmployee("src/main/resources/employees.csv");

        System.out.println(EmployeesSalarySum.sumSalaryByJob(employees2));
    }
}
