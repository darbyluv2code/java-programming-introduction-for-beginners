package lambdas.seven;

public class Employee {

    private int id;
    private String firstName;
    private int yearsOfService;

    public Employee(int id, String firstName, int yearsOfService) {
        this.id = id;
        this.firstName = firstName;
        this.yearsOfService = yearsOfService;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }
}
