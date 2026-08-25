package ArrayPractice;

public class Q20SecondLargeEle {
    public static void main(String[] args) {
        int[] arr={45,12,67,89,56,23};

        int sc=0;
        int lg=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lg){
                sc=lg;
                lg=arr[i];
            }else if(arr[i]!=lg && arr[i]>sc){
                sc=arr[i];
            }else{
                continue;
            }
        }
        System.out.print(sc);
    }
}
