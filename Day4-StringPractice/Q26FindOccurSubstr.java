package StringPractice;
public class Q26FindOccurSubstr {
    public static void main(String[] args) {
        String str="bananaban";
        String s="ban";
        for(int i=0;i<=str.length()-s.length();i++){
            String s1=str.substring(i,i+s.length());
            if(s.equals(s1)){
                System.out.println(i);
            }
        }

    }
}
