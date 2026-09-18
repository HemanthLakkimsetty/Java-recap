import java.util.List;
import java.util.ArrayList;

public class Student {
    int id;
    String name;
    int marks;
    String dept;

    public Student(){}
    public Student(int id,String name,int marks,String dept){
        this.id=id;
        this.name=name;
        this.marks=marks;
        this.dept=dept;
    }

    List<Student> studentList(){
        List<Student> studentsList=new ArrayList<>();

        studentsList.add(new Student(1, "Alice", 85, "CSE"));
        studentsList.add(new Student(2, "Bob", 78, "ECE"));
        studentsList.add(new Student(3, "Charlie", 92, "IT"));
        studentsList.add(new Student(4, "David", 67, "ME"));
        studentsList.add(new Student(5, "Eva", 88, "CSE"));
        studentsList.add(new Student(6, "Frank", 74, "EEE"));
        studentsList.add(new Student(7, "Grace", 91, "IT"));
        studentsList.add(new Student(8, "Hannah", 69, "ECE"));
        studentsList.add(new Student(9, "Ian", 80, "ME"));
        studentsList.add(new Student(10, "Jack", 95, "CSE"));
        studentsList.add(new Student(11, "Karen", 72, "EEE"));
        studentsList.add(new Student(12, "Leo", 89, "IT"));

        return studentsList;
    }

    @Override
        public String toString(){
            return "[\nName: "+name+"\nid: "+id+"\nMarks: "+marks+"\nDepartment: "+dept+"\n]";
        }
    
}
