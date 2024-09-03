// program to employeeID and salary
package Task2example4;

public class Main {
    public static void main(String[] args) {
        // Create a Task2example4.Person object
        Person person = new Person("John Doe", 30);
        System.out.println("Task2example4.Person Details:");
        person.displayPersonDetails();

        // Create an Task2example4.Employee object
        Employee employee = new Employee("Alice Smith", 28, "E12345", 75000.0);
        System.out.println("\nTask2example4.Employee Details:");
        employee.displayEmployeeDetails();
    }
}
