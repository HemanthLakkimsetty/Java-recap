package ClassesAndObjs;

public class Q1ClassFields {
    public static void main(String[] args) {
        Student sd=new Student();
        sd.dispaly();
        

    }
}

class Student{
    String name="Hemanth";
    int age=20;
    public Student(){
        this.name="Hemanth";
        this.age=20;
    }
    public void dispaly(){
        System.out.println("Student Name: "+name+"\n"+"Age: "+age);
    }
}