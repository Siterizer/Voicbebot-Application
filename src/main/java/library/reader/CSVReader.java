package library.reader;

import library.entity.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CSVReader implements EmployeeReader {

    @Override
    public List<Employee> readEmployee(String url) {
        String line;
        BufferedReader stream;
        List<List<String>> csvData = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();

        try {
            stream = new BufferedReader(new FileReader(url));
            stream.readLine();
            while ((line = stream.readLine()) != null){
                csvData.add(Arrays.asList(line.split(";")));
            }
        } catch (IOException e) {
            return null;
        }
        for(List<String> values : csvData){
            employees.add(Employee.builder()
                    .id(Long.parseLong(values.get(0).replaceAll("\\s+","").replace("\"", "")))
                    .name(values.get(1).replaceAll("\\s+","").replace("\"", ""))
                    .surname(values.get(2).replaceAll("\\s+","").replace("\"", ""))
                    .job(values.get(3).replaceAll("\\s+","").replace("\"", ""))
                    .salary(values.get(4).replaceAll("\\s+","").replace("\"", ""))
                    .build()
            );
        }
        return employees;
    }
}
