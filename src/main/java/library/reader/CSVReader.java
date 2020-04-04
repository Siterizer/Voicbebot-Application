package library.reader;

import library.entity.Employee;
import library.entity.Employees;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CSVReader implements EmployeeReader {

    @Override
    public Employees readEmployee(String url) {
        List<List<String>> csvData = new ArrayList<>();
        try {
            BufferedReader stream = new BufferedReader(new FileReader(url));
            stream.readLine();//get rid of attribute names
            String line;
            while ((line = stream.readLine()) != null){
                List<String> nextLine = Arrays.asList(line.split(";"));
                for (int i = 0; i < nextLine.size(); i++)
                {
                    nextLine.set(i, nextLine.get(i)
                            .replaceAll("[ \"]",""));
                }
                csvData.add(nextLine);
            }
        } catch (IOException e) {
            return null;
        }
        List<Employee> employees = new ArrayList<>();
        for(List<String> values : csvData){
            employees.add(Employee.builder()
                    .id(Long.parseLong(values.get(0)))
                    .name(values.get(1))
                    .surname(values.get(2))
                    .job(values.get(3))
                    .salary(values.get(4))
                    .build()
            );
        }
        return new Employees(employees);
    }
}
