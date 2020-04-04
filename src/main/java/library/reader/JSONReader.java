package library.reader;


import com.google.gson.Gson;
import library.entity.Employees;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSONReader implements IEmployeesReader {

    @Override
    public Employees readEmployee(String path) {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(path));
            return new Gson().fromJson(reader, Employees.class);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
