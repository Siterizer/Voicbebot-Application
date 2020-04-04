package library.readers;


import com.google.gson.Gson;
import library.entities.Employee;
import library.entities.Employees;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JSONReader implements EmployeeReader {

    @Override
    public List<Employee> readEmployee(String url) {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(url));
            return new Gson().fromJson(reader, Employees.class).getEmployees();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
