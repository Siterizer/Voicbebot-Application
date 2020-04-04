import library.entities.Employee;
import library.entities.Employees;
import library.readers.JSONReader;

public class Main {

    public static void main(String [] args){

        JSONReader jsonReader = new JSONReader();
        Employees employees = jsonReader.readEmployee("src/main/resources/employees.json");
        for(Employee employee : employees.getEmployees()){
            System.out.println(employee);
        }

    }
}
