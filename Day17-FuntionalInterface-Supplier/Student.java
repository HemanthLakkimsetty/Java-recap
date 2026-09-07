public class Student {
    int id;
    int marks;
    String name;

    Student(int id, int marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }

    static Student createStudent() {
        return new Student(1, 85, "Ravi");
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}