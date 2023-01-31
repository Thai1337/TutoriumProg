import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Employee> employee = Optional.of(new Employee(10, "hi"));

        employee.orElseThrow(() -> new RuntimeException("Hi"));
    }
}
