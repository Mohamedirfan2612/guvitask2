// program to employeeID and salary
package Task2example4;

public class Employee extends Person {
        private String employeeID;
        private double salary;

        // Constructor to initialize employeeID and salary, and use super to initialize name and age
        public Employee(String name, int age, String employeeID, double salary) {
            super(name, age); // Call the constructor of Task2example4.Person
            this.employeeID = employeeID;
            this.salary = salary;
        }

        // Method to display employee details
        public void displayEmployeeDetails() {
            // Call the method from Task2example4.Person class
            displayPersonDetails();
            System.out.println("Task2example4.Employee ID: " + employeeID);
            System.out.println("Salary: " + salary);
        }
    }

