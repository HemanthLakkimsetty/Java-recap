package StringPractice;



public class Q30CompressStringCharCount {
    public static void main(String[] args) {
        String str="aabcccccaaa";
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<str.length()){
            int j=i;
            int cnt=0;
            while(j<str.length() && str.charAt(j)==str.charAt(i)){
                cnt++;
                j++;
            }
            sb.append(str.charAt(i)).append(cnt);
            i=j;
        }
        System.out.println(sb.toString());
    }
}

//i,i+1 number,sb.append(.sstring.valueOf(c).repeat(n))