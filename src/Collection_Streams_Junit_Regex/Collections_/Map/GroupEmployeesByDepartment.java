package Collection_Streams_Junit_Regex.Collections_.Map;

import java.util.*;

class Employee {
    String name;
    String dept;

    Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }
}

public class GroupEmployeesByDepartment {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<String>> map = new HashMap<>();

        for (Employee e : list) {

            map.putIfAbsent(e.dept, new ArrayList<>());
            map.get(e.dept).add(e.name);
        }

        System.out.println(map);
    }
}