package StringPractice;

public class Q29EcodeString {
    public static void main(String[] args) {
        String str="Hello Zebra";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='Z'){
                sb.append('A');
            }
            else if(ch=='z'){
                sb.append('a');
            }
            else if((ch>='a' && ch<='y')||(ch>='A' && ch<='Y')){
                sb.append((char)(ch+1));
            }
            else if(ch==' '){
                sb.append(' ');
            }
        }
        System.out.println(sb.toString());
    }
}
//using math
/*
if(ch>='A' && ch<='Z'){
    ch=(char)('A'+(ch-'A'+1)%26);
}else if(ch>='a'&& ch<='z'){
    ch=('a'+(ch-'a'+1)%26);
}
*/