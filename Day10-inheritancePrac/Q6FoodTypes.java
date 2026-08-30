package inheritancePrac;

public class Q6FoodTypes {
    public static void main(String[] args) {
        Food f=new FastFood("Burger",450 , true);
        f.display();
    }
}

class Food{
    String name;
    double cal;
    public Food(String name,double cal){
        this.name=name;
        this.cal=cal;
    }

    public void display(){
        System.out.println("Name: "+name+"\n"+"Calories: "+cal);
    }
}

class FastFood extends Food{
    boolean isFastFood;

    public FastFood(String name,double cal,boolean isFastFood){
        super(name,cal);
        this.isFastFood=isFastFood;
    }

    public void display(){
        System.out.println("Food: "+name+"\n"+"Calories:"+cal+"\n"+"Type: "+((isFastFood)?"Fast Food":"Not Fast Food"));
    }
}