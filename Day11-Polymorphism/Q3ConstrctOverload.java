package Poly;

public class Q3ConstrctOverload {
    public static void main(String[] args) {
        Students0 s1=new Students0();
        Students0 s2=new Students0("Hemanth");
        Students0 s3=new Students0("Hemanth",23,22227);

        s1.display();
        s2.display();
        s3.display();
        
    }
}

class Students0{
    String name;
    int rollNo;
    int age;

    Students0(){
        name = "Unknown";
        age = 0;
        rollNo = 0;
    }
    
    Students0(String name){
        this.name=name;
        age = 0;
        rollNo = 0;
    }

    Students0(String name ,int age,int rollNo){
        this.name=name;
        this.age=age;
        this.rollNo=rollNo;
    }

    void display(){
        System.out.println("Student : " +name + ", " + age + ", " + rollNo);
    }
    
}