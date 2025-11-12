// TestEncapsulation class to test the Employee class
public class TestEncapsulation {

    public static String compareSalaries(Employee employee1, Employee employee2) {
        if (employee1.getSalary() > employee2.getSalary()) {
            return "Salary of " + employee1.getName() + " is more than " + employee2.getName();
        } else if (employee1.getSalary() == employee2.getSalary()) {
            return "Equals salaries";
        }
        return "Salary of " + employee1.getName() + " is less than " + employee2.getName();
    }

    public static void main(String[] args) {
        // Step 1: Create two instances of the Employee class
        // One using the parameterized constructor and one using default constructor with setters

        Employee employee1 = new Employee("Maxim", 45, 2000.0);

        Employee employee2 = new Employee();
        employee2.setName("Vera");
        employee2.setAge(44);
        employee2.setSalary(1000.0);

        // Step 2: Print details of both employees

        System.out.println("=====");
        employee1.displayEmployeeDetails();
        employee2.displayEmployeeDetails();
        System.out.println("=====");

        // Step 3: Try setting invalid values (null name, age outside range, negative salary)
        // and see if your validation works

        employee1.setName("");
        employee1.setAge(5);
        employee1.setSalary(-10);
        
        // Step 4: Give both employees a 10% raise and display their details again

        employee1.giveRaise(110);
        employee2.giveRaise(120);

        System.out.println(employee1);
        System.out.println(employee2);

        // Step 5: Clone the first employee and display the cloned employee details
        // Hint: Use try-catch block to handle CloneNotSupportedException
        // Employee clonedEmployee = (Employee) employee1.clone();

        Employee employee4;

        try {
            Employee employee3 = (Employee) employee1.clone();
            System.out.println(employee3);
            employee4 = employee3;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        // Step 6: Modify the original employee and verify that the clone remains unchanged
        // This demonstrates that cloning creates a separate object

        employee1.setName("Katka");
        employee1.setAge(18);
        employee1.setSalary(1000.0);

        System.out.println(employee1);
        System.out.println(employee4);

        // Step 7: Create a method that compares the salaries of two employees
        // and returns the name of the employee with the higher salary
        // If salaries are equal, return "Equal salaries"

        System.out.println(compareSalaries(employee1, employee2));

    }
}
