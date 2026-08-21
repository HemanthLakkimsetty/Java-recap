package LoopsControlStates;

public class Q7SumEvensSkip7 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<=100;i++){
            if(i%2==0 && i%7!=0){
                sum+=i;
            }else{
                continue;
            }
        }
        System.out.println(sum);
    }
}
