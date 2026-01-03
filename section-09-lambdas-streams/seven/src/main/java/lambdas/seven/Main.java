package lambdas.seven;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Eric", 8));
        employees.add(new Employee(2, "Milo", 5));
        employees.add(new Employee(3, "Melissa", 12));
        employees.add(new Employee(4, "Elijah", 1));
        employees.add(new Employee(5, "Adil", 24));
        employees.add(new Employee(6, "Enrique", 1));
        employees.add(new Employee(7, "Chad", 18));

//        int employeeYearsAboveTen = 0;
//        for (Employee e : employees) {
//            if (e.getYearsOfService() > 10) {
//                employeeYearsAboveTen++;
//            }
//        }

        long employeeYearsAboveTen = employees.stream()
                .filter(e -> e.getYearsOfService() > 10).count();

        System.out.println(employeeYearsAboveTen);

//        List<Employee> namesStartWithE = new ArrayList<>();
//
//        for (Employee e : employees) {
//            if (e.getFirstName().startsWith("E")) {
//                    namesStartWithE.add(e);
//        }
//
//        for (Employee n : namesStartWithE) {
//            System.out.println(n.getFirstName());
//        }

        List<Employee> namesStartWithE = employees.stream()
                .filter(e -> e.getFirstName().startsWith("E"))
                .toList();

        namesStartWithE.forEach(n -> System.out.println(n.getFirstName()));
    }
}