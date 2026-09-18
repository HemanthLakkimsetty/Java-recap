public class Q38ConditionalAnalysis {
    public static void main(String[] args) {
        Student std=new Student();

        boolean val1=std.studentList()
                        .stream()
                        .filter(x->x.dept.equalsIgnoreCase("CSE"))
                        .allMatch(x->x.marks>60);

        boolean val2=std.studentList()
                        .stream()
                        .filter(x->x.dept.equalsIgnoreCase("CSE"))
                        .anyMatch(x->x.marks>90);

        System.out.println((val1 & val2)?"true":"false");
    }
}
