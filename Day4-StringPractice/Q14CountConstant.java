package StringPractice;

public class Q14CountConstant {
    public static void main(String[] args) {
        String str="Java Programming".toLowerCase().replaceAll(" ","");
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if("aeiou".indexOf(str.charAt(i))>=0){
                continue;
            }else{
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
