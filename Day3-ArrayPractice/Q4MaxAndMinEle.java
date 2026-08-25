package ArrayPractice;

public class Q4MaxAndMinEle {
    public static void main(String[] args) {
        int[] arr={45,12,78,34,9,56};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }
        System.out.println(max+"\n"+min);
    }
}
