import java.util.Scanner;

public class Q5EmpSal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int empId=sc.nextInt();
        String empName=sc.next();
        double Salary=sc.nextDouble();
        double incre=sc.nextDouble();
        Emp1 emp=new Emp1(empId,empName,Salary);
        System.out.println(emp.empSalary(incre));
        sc.close();
    }
}

class Emp1{
    int empId;
    String empName;
    double Salary;
    public Emp1(int empId,String empName,double Salary){
        this.empId=empId;
        this.empName=empName;
        this.Salary=Salary;
    }
    public double empSalary(double incre){
        return Salary+incre;
    }
}