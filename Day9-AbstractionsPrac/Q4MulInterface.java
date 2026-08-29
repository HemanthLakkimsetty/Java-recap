package AbstractionsPrac;

public class Q4MulInterface {
    public static void main(String[] args) {
        Img i=new Img(50,90);
        i.display();
    }
}

interface ResizeImg{
    default void display(){
        System.out.println("Resized img");
    }
}

interface RotatedImg{
    default void display(){
        System.out.println("Rotated img");
    }
}

class Img implements ResizeImg,RotatedImg{
    int re;
    int rot;

    Img(int re,int rot){
        this.re=re;
        this.rot=rot;
    }

    public void display(){
        System.out.println("Resized: "+re+"\n"+"Rotated: "+rot);
    }
}


