import java.util.*;

public class employeeGrouper {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> departmentMap = new HashMap<>();
        for (Employee employee : employees) {
            departmentMap.computeIfAbsent(employee.getDepartment(), k -> new ArrayList<>()).add(employee);
        }
        return departmentMap;
    }

    public static void main(String[] args) {
        
        List<Employee> employees = Arrays.asList(
                new Employee(0, "Alice", "HR", 0),
                new Employee(0, "Bob", "IT", 0),
                new Employee(0, "Carol", "HR", 0)
        );

        Map<String, List<Employee>> groupedEmployees = groupByDepartment(employees);
        System.out.println(groupedEmployees);
    }
}