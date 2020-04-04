package library.reader;


import com.google.gson.Gson;
import library.entity.Employees;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSONReader implements EmployeeReader {

    @Override
    public Employees readEmployee(String url) {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(url));
            return new Gson().fromJson(reader, Employees.class);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
