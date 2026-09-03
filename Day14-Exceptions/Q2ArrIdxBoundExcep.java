public class Q2ArrIdxBoundExcep {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        try{
            System.out.println(arr[6]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception: ARRAY LIMIT IS "+arr.length+" SO U CANT ACCESS DUE TO "+e.getMessage());
        }
    }
    
}
