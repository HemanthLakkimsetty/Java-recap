package LoopsControlStates;

public class Q12FirstEvenGreat50 {
    public static void main(String[] args) {
        for(int i=50;;i+=2){
            if(i>50 && i%2==0){
                System.out.print(i);
                break;
            }
        }
    }
}
