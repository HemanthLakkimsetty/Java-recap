package ArrayPractice;

public class Q16RemoveEleEven {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        int k=0;
        for(int i=1;i<arr.length;i+=2){
            arr[k++]=arr[i];
        }

        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
