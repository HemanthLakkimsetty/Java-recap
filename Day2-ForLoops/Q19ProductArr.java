public class Q19ProductArr {
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        int prod=1;
        for(int i=0;i<arr.length;i++){
            prod*=arr[i];
        }
        System.out.println(prod);
    }
}