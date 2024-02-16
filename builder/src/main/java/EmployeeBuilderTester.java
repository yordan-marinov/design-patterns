public class EmployeeBuilderTester {

    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder("Mikey", "Mouse")
                .setIsPartTime(true)
                .build();

        System.out.println(employee);
    }
}
