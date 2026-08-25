package StringPractice;

public class Q17LongestWord {
    public static void main(String[] args) {
        String str="Java programming language";
        String[] arr=str.split(" ");
        int maxLen=0;
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>maxLen){
                idx=i;
                maxLen=arr[i].length();
            }
        }
        System.out.println(arr[idx]);
    }
}
