package library.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


@Getter
@AllArgsConstructor
@Builder
@ToString
public class Employees {

    List< Employee > employees = new ArrayList<Employee>();
}
