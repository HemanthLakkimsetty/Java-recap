package StringPractice;

public class Q18ReverseWordSen {
    public static void main(String[] args) {
        String str="Java is fun";
        StringBuilder sb=new StringBuilder();
        String[] arr=str.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            sb=sb.append(arr[i]+" ");
        }
        System.out.println(sb.toString().trim());
    }
}
