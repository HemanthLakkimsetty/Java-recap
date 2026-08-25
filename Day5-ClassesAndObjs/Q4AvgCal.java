package ClassesAndObjs;

import java.util.Scanner;

public class Q4AvgCal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int age=sc.nextInt();
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        Student1 st=new Student1(name,age,m1,m2,m3);
        double avg=st.avgMarksCal(m1, m2, m3);
        System.out.println(name+"\n"+age+"\n"+avg);
        sc.close();
    }
}

class Student1{
    String name;
    int age;
    int m1;
    int m2;
    int m3;
    public Student1(String name,int age,int m1,int m2,int m3){
        this.name=name;
        this.age=age;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }

    public double avgMarksCal(int m1,int m2,int m3){
        int avg=m1+m2+m3;
        return avg/3;
    }
}