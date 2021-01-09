package Q3_03;


 class Cream{
    public void prepare(){}
}
 class Cake extends Cream{
    public void bake(int min, int temp){};
}


class Shop{
     private Cake c=new Cake();
     private  final double discount=0.25;
     public void makeReady(){c.bake(10,120);}
}

public class Test extends Cake{
     public void bake(int minutes, int pemperature){

     }
//     public void addToppings('')
    public static void main(String[] args) {

    }
}