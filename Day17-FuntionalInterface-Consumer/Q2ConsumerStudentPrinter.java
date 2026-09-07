import java.util.function.Consumer;

public class Q2ConsumerStudentPrinter {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Alice", 85);
        Student s2 = new Student(2, "Bob", 92);
        Student s3 = new Student(3, "Charlie", 78);
        Student s4 = new Student(4, "Diana", 88);
        Student s5 = new Student(5, "Ethan", 95);
        Student s6 = new Student(6, "Fiona", 88);

        Student[] stds={s1,s2,s3,s4,s5,s6};
        printStudentByConsumer(stds,x->System.out.println(x));

    }

    static void printStudentByConsumer(Student[] stds,Consumer<Student> condition){
        for(Student s: stds){
            condition.accept(s);
        }
    }
}

class Student{
    int id;
    String name;
    int marks;

    public Student(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    public String toString(){
        return "["+"Id: "+id+" Name: "+name+" marks: "+marks+"]";
    }
}
