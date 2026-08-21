public class Q18AvgArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int avg=0;
        for(int i=0;i<arr.length;i++){
            avg+=arr[i];
        }
        System.out.println(avg/arr.length);
    }
}
