import java.util.function.Predicate;

public class Q8StudentFilterMethod {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Ravi", 85);
        Student s2 = new Student(2, "Kumar", 72);
        Student s3 = new Student(3, "Anil", 91);
        Student s4 = new Student(4, "Sita", 65);
        Student s5 = new Student(5, "Raju", 88);

        Student[] arr={s1,s2,s3,s4,s5};

        stdFilter(arr,(x)->x.marks>=80);
        System.out.println();
        stdFilter(arr,(x)->x.marks<70);
        System.out.println();
        stdFilter(arr,(x)->x.name.toLowerCase().charAt(0)=='A');
        System.out.println();
        stdFilter(arr,(x)->x.marks>90);


    }

    static void stdFilter(Student[] arr,Predicate<Student> condition){
        for(Student s: arr){
            if(condition.test(s)){
                System.out.println(s);
            }
        }
    }
}


