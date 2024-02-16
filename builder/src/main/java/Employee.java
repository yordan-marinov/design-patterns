import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Employee {

    private final String firstName;
    private final String lastName;
    private final boolean isPartTime;

    public Employee(EmployeeBuilder employeeBuilder) {
        this.firstName = employeeBuilder.firstName;
        this.lastName = employeeBuilder.lastName;
        this.isPartTime = employeeBuilder.isPartTime;
    }

    public static class EmployeeBuilder {
        private final String firstName;
        private final String lastName;
        private boolean isPartTime;  // This is the optional field

        public EmployeeBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public EmployeeBuilder setIsPartTime(boolean isPartTime) {
            this.isPartTime = isPartTime;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
