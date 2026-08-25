package ClassesAndObjs;

public class Q2ObjCreation {
    public static void main(String[] args) {
        Employee emp=new Employee();
        System.out.println(emp.empId+"\n"+emp.empName);
    }
}

class Employee{
    int empId=101;
    String empName="Hemanth";
}
