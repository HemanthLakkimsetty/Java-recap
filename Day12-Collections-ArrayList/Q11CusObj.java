import java.util.*;
public class Q11CusObj {
    public static void main(String[] args) {
        ArrayList<student> al=new ArrayList<>();
        for(int i=0;i<3;i++){
            al.add(new student(i, "a"+i, 50+i));
        }
        System.out.println(al);
    }
}

class student{
    int id;
    String name;
    double marks;
    student(int id,String name,double marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public String toString(){
        return id+" "+name+" "+marks;
    }
}
