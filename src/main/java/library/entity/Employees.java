package library.entity;

import lombok.*;

import java.util.List;


@Getter
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Employees {

    List<Employee> employees;
}
