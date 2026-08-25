package ArrayPractice;

public class Q5AvgEle {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int avg=0;
        for(int i: arr){
            avg+=i;
        }
        System.out.println(avg/arr.length);
    }
}
