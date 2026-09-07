import java.util.function.Predicate;;

public class Q7ObjPredicate {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Ravi", 85);
        Student s2 = new Student(2, "Kumar", 72);
        Student s3 = new Student(3, "Anil", 91);
        Student s4 = new Student(4, "Sita", 65);
        Student s5 = new Student(5, "Raju", 88);

        Student[] students={s1,s2,s3,s4,s5};
        Predicate<Student> marksgre81=(x)->x.marks>=80;
        for(Student s:students){
            if(marksgre81.test(s))
                System.out.println(s);
        System.out.println();
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
        return "Id: "+id+"\nName: "+name+"\nMarks :"+marks;
    }

}
