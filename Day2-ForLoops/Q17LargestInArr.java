public class Q17LargestInArr {
    public static void main(String[] args) {
        int[] arr={1,2,0,4,6,4,2,4,56,10};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        System.out.println(max);
    }
}
