package ArrayPractice;

public class Q10PalinArr {
    public static void main(String[] args) {
        int[] arr={1,2,1,2,1};
        int i=0;
        int j=arr.length-1;
        boolean palin=true;
        while(i<=j){
            if(arr[i]!=arr[j]){
                palin=false;
                break;
            }
            i++;
            j--;
        }
        if(!palin){
            System.out.println("not a palindrome");
        }else{
            System.out.println("Palindrome");
        }
    }
}
