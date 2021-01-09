package Q76;

import javax.smartcardio.Card;

public class Test {
    public static void main(String[] args) {

    }
}
class Product{
    interface Moveable{void move();}
    Moveable mProduct=new Moveable() {
        @Override
        public void move() {

        }
    };
}
//class Computer{
//  private Card sCard=new SoundCard();
//  private abstract class Card{ public void readCard();}
//  private class  SoundCard extends Card{}
//}

//class Vahicle{
//    int id;
//    public  void start(){
//        public class Engine{ int eNo=id}
//    }
//}

//class Block{
//    int bno;
//    static class Counter{
//        int locator;
//        Counter(){locator=bno;}
//    }
//}