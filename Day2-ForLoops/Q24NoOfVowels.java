import java.util.Scanner;

public class Q24NoOfVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if("aeiouAEIOU".indexOf(str.charAt(i))>=0){
                cnt+=1;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
