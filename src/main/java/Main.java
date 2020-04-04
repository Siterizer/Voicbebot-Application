import library.entities.Employee;

import java.math.BigDecimal;

public class Main {

    public static void main(String [] args){
        BigDecimal salary = new BigDecimal("10.0");
        Employee employee = new Employee(54, "Adam", "Macura", "Muzyk", salary);
        System.out.println(employee);
    }
}
