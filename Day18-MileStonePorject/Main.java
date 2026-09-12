
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        // Initial students
        students.add(new Student(1, "Ravi", 85));
        students.add(new Student(2, "Sita", 72));
        students.add(new Student(3, "Kiran", 91));
        students.add(new Student(4, "Arjun", 65));
        students.add(new Student(5, "Priya", 88));
        students.add(new Student(6, "Anil", 95));
        students.add(new Student(7, "Rahul", 55));
        students.add(new Student(8, "Sneha", 78));
        students.add(new Student(9, "Asha", 92));
        students.add(new Student(10, "Vikram", 45));

        // Supplier
        Supplier<Student> supplier =
                StudentFactory.getSupplier();


        while (true) {

            System.out.println();
            System.out.println("=================================");
            System.out.println("     STUDENT PROCESSING SYSTEM");
            System.out.println("=================================");

            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Marks >= 80 -> Names");
            System.out.println("4. Marks < 70 -> Names");
            System.out.println("5. Marks >= 90 -> Marks");
            System.out.println("6. Name starts with A -> Marks");
            System.out.println("7. Marks >= 80 -> Grade");
            System.out.println("8. Generate Student");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");

            int choice = sc.nextInt();


            switch (choice) {
                // ADD STUDENT
                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    Student student =
                            new Student(id, name, marks);

                    students.add(student);

                    System.out.println(
                            "Student added!"
                    );

                    break;

                // DISPLAY STUDENTS
                case 2:

                    for (Student s : students) {
                        System.out.println(s);
                    }

                    break;

                // MARKS >= 80 -> NAME -> PRINT
                case 3:

                    System.out.println(
                            "\nStudents with marks >= 80:"
                    );

                    StudentProcessor.process(
                            students,
                            StudentRules.marksAbove80,
                            StudentRules.getName,
                            StudentRules.printString
                    );

                    break;

                // MARKS < 70 -> NAME -> PRINT
                case 4:

                    System.out.println(
                            "\nStudents with marks < 70:"
                    );

                    StudentProcessor.process(
                            students,
                            StudentRules.marksBelow70,
                            StudentRules.getName,
                            StudentRules.printString
                    );

                    break;

                // MARKS >= 90 -> MARKS -> PRINT
                case 5:

                    System.out.println(
                            "\nMarks >= 90:"
                    );

                    StudentProcessor.process(
                            students,
                            StudentRules.marksAbove90,
                            StudentRules.getMarks,
                            StudentRules.printInteger
                    );

                    break;

                // NAME STARTS A -> MARKS -> PRINT
                case 6:

                    System.out.println(
                            "\nNames starting with A:"
                    );

                    StudentProcessor.process(
                            students,
                            StudentRules.nameStartsWithA,
                            StudentRules.getMarks,
                            StudentRules.printInteger
                    );

                    break;

                // MARKS >= 80 -> GRADE -> PRINT
                case 7:

                    System.out.println(
                            "\nGrades:"
                    );

                    StudentProcessor.process(
                            students,
                            StudentRules.marksAbove80,
                            StudentRules.getGrade,
                            StudentRules.printString
                    );

                    break;

                // SUPPLIER
                case 8:

                    Student generated =
                            supplier.get();

                    students.add(generated);

                    System.out.println(
                            "Generated student:"
                    );

                    System.out.println(generated);

                    break;

                // EXIT
                case 0:

                    System.out.println(
                            "Program ended."
                    );

                    sc.close();

                    return;


                default:

                    System.out.println(
                            "Invalid choice!"
                    );
            }
        }
    }
}