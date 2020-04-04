package library.entity;

import lombok.*;


@Getter
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Employee {

    private Long id;
    private String name;
    private String surname;
    private String job;
    private String salary;
}
