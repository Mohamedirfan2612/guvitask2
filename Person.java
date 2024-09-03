// program to employeeID and salary
package Task2example4;

public class Person {
    protected String name;
        protected int age;

        // Constructor to initialize name and age
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to display person details
        public void displayPersonDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }


