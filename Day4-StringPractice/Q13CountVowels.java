package StringPractice;

public class Q13CountVowels {
    public static void main(String[] args) {
        String str="OpenAI ChatGPT".replaceAll(" ","").toLowerCase();
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if("aeiou".indexOf(str.charAt(i))>=0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
