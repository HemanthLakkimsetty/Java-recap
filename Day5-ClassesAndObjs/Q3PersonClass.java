package ClassesAndObjs;

public class Q3PersonClass {
    public static void main(String[] args) {
        Person pn=new Person(23,"Hemanth");
        pn.dispaly();
    }
}

class Person{
    int age;
    String Name;
    public Person(int age,String Name){
        this.age=age;
        this.Name=Name;
    }
    public void dispaly(){
        System.out.println(age+"\n"+Name);
    }
}