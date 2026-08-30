package inheritancePrac;

public class Q2MultiLevelInheri {
    public static void main(String[] args) {
        Person p1=new Employee01("John",24,32000);
        Person p2=new Manager("Nick",23,52000,"Hiring");

        p1.display();
        System.out.println();
        p2.display();
    }
}

class Person{
    String name;
    int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void display(){
        System.out.println("Name: "+name+"\n"+"Age: "+age);
    }
}

class Employee01 extends Person{
    double sal;
    public Employee01(String name,int age,double sal){
        super(name,age);
        this.sal=sal;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+sal);
    }
}

class Manager extends Employee01{
    String dept;
    public Manager(String name,int age,double sal,String dept){
        super(name,age,sal);
        this.dept=dept;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + sal);
        System.out.println("Department: " + dept);
    }
}