// Employee class to demonstrate encapsulation
public class Employee implements Cloneable {
    // Step 1: Declare private variables for name, age, and salary
    // Hint: Use appropriate data types (String, int, double)

    private String name;
    private int age;
    private double salary;
    
    // Step 2: Create constructors
    // 2.1: Create a default constructor that sets name to "Unknown", age to 18, and salary to 0.0
    // Hint: public Employee()

    public Employee() {
        name = "Unknown";
        age = 18;
        salary = 0.0;
    }
    
    // 2.2: Create an overloaded constructor that initializes all three variables
    // Hint: public Employee(String name, int age, double salary)

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Step 3: Create public getter methods for each variable
    // Hint: Use the format: public returnType getVariableName()

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Step 4: Create public setter methods for each variable
    // Hint: Use the format: public void setVariableName(parameter)
    // Add validation logic in the setter methods:
    // - For name: Ensure it is not null or empty
    // - For age: Ensure it is between 18 and 65 (inclusive)
    // - For salary: Ensure it is greater than or equal to 0

    public void setName(String name) {
        if (name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Ensure it is not null or empty");
        }
    }

    public void setAge(int age) {
        if (age <= 18 || age >= 65) {
            this.age = age;
        } else {
            System.out.println("Ensure it is between 18 and 65 (inclusive)");
        }
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Ensure it is greater than or equal to 0");
        }
    }

    // Step 5: Create a public method to calculate annual salary (monthly salary * 12)
    // Hint: public double calculateAnnualSalary()

    public double calculateAnnualSalary() {
        return salary * 12;
    }

    // Step 6: Create a public method to give a raise (percentage)
    // This method should increase the salary by the given percentage
    // Hint: public void giveRaise(double percentage)

    public void giveRaise(double percentage) {
        salary *= percentage;
    }

    // Step 7: Create a public method to display employee details
    // Hint: Use System.out.println() to print name, age, monthly salary, and annual salary

    public void displayEmployeeDetails(Employee employee) {
        System.out.println("Name - " + employee.getName() +
                "\nAge - " + employee.getAge() +
                "\nSalary (monthly) - " + employee.getSalary() +
                "\nSalary (annual) - " + employee.calculateAnnualSalary());
    }

    // Step 8: Override the clone method to make Employee objects cloneable
    // Hint: @Override protected Object clone() throws CloneNotSupportedException
    // Return super.clone() to create a shallow copy of the object

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
