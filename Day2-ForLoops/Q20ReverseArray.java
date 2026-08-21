public class Q20ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] a=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            a[j]=arr[i];
            System.out.print(a[j]);
            j++;
        }
    }
}
