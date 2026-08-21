public class Q26CountWords {
    public static void main(String[] args) {
        String str="   Java is object oriented   ".trim();
        int cnt=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
