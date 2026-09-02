import java.util.*;

public class Q1ComparableIntro{
    public static void main(String[] args) {
        std s1=new std("a",001,23);
        std s2=new std("b",003,30);
        std s3=new std("c",002,21);
        ArrayList <std> al=new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        Collections.sort(al);
        System.out.println(al);
    }
}

class std implements Comparable<std>{
    String name;
    int rollNo;
    int marks;
    std(String name,int rollNo,int marks){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
    }
    @Override
    public int compareTo(std s){
        return s.rollNo-this.rollNo;
    }

    @Override
    public String toString(){
        return (rollNo+". "+name+"["+marks+"]");
    }
}

//neg --> no swap
//pos --> swap
//0 --> equals


/*if(this.marks<s.marks){
    return 1;
}else if(this.marks==s.marks){
    return 0;
}else{
    return -1;
}
*/