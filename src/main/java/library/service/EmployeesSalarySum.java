package library.service;

import library.entity.Employee;
import library.entity.Employees;

import java.math.BigDecimal;
import java.util.HashMap;

public class EmployeesSalarySum {

    public HashMap<String, BigDecimal> sumSalaryByJob(Employees employees){

        HashMap<String, BigDecimal> map = new HashMap<>();

        for(Employee employee : employees.getEmployees()){
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
