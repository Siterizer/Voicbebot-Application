package library.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;
import java.util.Objects;


@Getter
@AllArgsConstructor
@Builder
@ToString
public class Employees {

    List< Employee > employees;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees1 = (Employees) o;
        return Objects.equals(employees, employees1.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employees);
    }
}
