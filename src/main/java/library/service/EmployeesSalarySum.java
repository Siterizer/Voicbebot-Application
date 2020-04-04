package library.service;

import library.entity.Employee;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

public class EmployeesSalarySum {

    public static HashMap<String, BigDecimal> sumSalaryByJob(List<Employee> employeeList){

        HashMap<String, BigDecimal> map = new HashMap<>();

        for(Employee employee : employeeList){
            String key = employee.getJob();
            BigDecimal value = new BigDecimal(employee.getSalary().replaceAll(",", "."));

            if(map.get(key) != null){
                map.put(key, map.get(key).add(value));
            } else{
                map.put(key, value);
            }
        }
        return map;
    }
}
