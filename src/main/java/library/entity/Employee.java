package library.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;


@Getter
@AllArgsConstructor
@Builder
@ToString
public class Employee {

    private Long id;
    private String name;
    private String surname;
    private String job;
    private String salary;
}
