package library.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
@Builder
@ToString
public class Employee {

    private long id;
    private String name;
    private String surname;
    private String job;
    private BigDecimal salary;
}
