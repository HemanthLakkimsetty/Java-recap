public class Q27ReverseWordInSen {
    public static void main(String[] args) {
        String str="Java is fun";
        String[] arr=str.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
