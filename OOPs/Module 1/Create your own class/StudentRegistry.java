// StudentRegistry class to test the Student class
public class StudentRegistry {
    public static void main(String[] args) {
        System.out.println("Step 1: Create two instances of the Student class");
        Student student1 = new Student();
        Student student2 = new Student();

        System.out.println("Step 2: Use setter methods to set values for all attributes of first student");
        // Example values: ID "S001", name "John Doe", grade 85.5, active true
        student1.setStudentId("Id001");
        student1.setName("Maxim");
        student1.setGrade(90.6);
        student1.setIsActive(true);

        System.out.println("Step 3: Set values for second student");
        // Example values: ID "S002", name "Jane Smith", grade 92.0, active true
        student2.setStudentId("Id002");
        student2.setName("Vera");
        student2.setGrade(85.8);
        student2.setIsActive(false);

        System.out.println("Step 4: Display details of both students");
        student1.displayStudentDetails();
        student2.displayStudentDetails();

        System.out.println("Step 5: Compare the grades of the two students and print who has the higher grade");
        // Hint: Create a separate method for this comparison
        compareGrabes(student1, student2);

        System.out.println("Step 6: Test the letter grade method for both students");
        char letterStudent1 = student1.letterGradeBased(student1.getGrade());
        char letterStudent2 = student2.letterGradeBased(student2.getGrade());

        System.out.println("The letter of " + student1.getName() + " is - " + letterStudent1);
        System.out.println("The letter of " + student2.getName() + " is - " + letterStudent2);

        System.out.println("Step 7: Test the passing status method for both students");
        System.out.println("Passing Status: ");
        System.out.println(student1.getName() + " is " + (student1.isPassed() ? "passing" : "not passing"));
        System.out.println(student2.getName() + " is " + (student2.isPassed() ? "passing" : "not passing"));

        System.out.println("Step 8: Change one student to inactive and display the updated information");
        student1.setIsActive(false);
        student1.displayStudentDetails();

        System.out.println("Test invalid grade");
        student1.setGrade(105);

    }
    
    // Step 9: Create a static method to compare two students' grades and return the student with the higher grade
    // Hint: Take two Student objects as parameters
    public static void compareGrabes(Student student1, Student student2) {
        if (student1.getGrade() > student2.getGrade()) {
            System.out.println("The grade of " + student1.getStudentId() + " is higher");
        } else {
            System.out.println("The grade of " + student1.getStudentId() + " is lower");
        }
    }

}
