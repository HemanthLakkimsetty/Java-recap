import java.util.*;
public class Q6LambdaWithObj {
    public static void main(String[] args) {
        ArrayList<StudentClass> al=new ArrayList<>();
        al.add(new StudentClass(1, "a",98));
        al.add(new StudentClass(2, "b",89));
        al.add(new StudentClass(3, "c",69));
        al.add(new StudentClass(4 ,"d",70));


        checkStudentMarksGreaterThan79(al, (sc80)->sc80.mrks>80);
    }
    static void checkStudentMarksGreaterThan79(ArrayList<StudentClass> students,studentCheck80 sc80){
        for(StudentClass sc: students){
            if(sc80.check(sc))
                sc.displayByMarks();
        }
    }
}

class StudentClass{
    int ser;
    String name;
    int mrks;
    public StudentClass(int ser,String name,int mrks){
        this.ser=ser;
        this.name=name;
        this.mrks=mrks;
    }

    void displayByMarks(){
        System.out.println("Marks: "+mrks+" Of "+name);
    }
}


@FunctionalInterface
interface studentCheck80{
    boolean check(StudentClass sc);
}