package Encaps;

public class Q1EncapIntro {
    public static void main(String[] args) {
        Std2 s=new Std2();
        s.setAge(23);
        s.setStudentName("Hemanth");
        System.out.println(s.getStudentName()+"\n"+s.getAge());
    }
}

class Std2{
    private String studentName;
    private int age;

    public int getAge() {
        return age;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String studentName){
        this.studentName=studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}