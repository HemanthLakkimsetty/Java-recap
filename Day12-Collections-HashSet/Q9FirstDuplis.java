import java.util.HashSet;

public class Q9FirstDuplis {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,5,6};
        HashSet<Integer> hs=new HashSet<>();
        for(int i:arr){
            if(hs.contains(i)){
                System.out.println("First duplicate:"+i);
                break;
                
            }else{
                hs.add(i);
            }
        }
    }
}
