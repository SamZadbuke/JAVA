abstract class pen{
    abstract void write();
    abstract void refill();
}
class FountedPen extends pen{
     void write(){
         System.out.println("write");
     }
        void refill(){
            System.out.println("refill");
        }
        void changenib(){
            System.out.println("chnaging the nib");
        }
}
interface basicanimal {
    void eat();

    void sleep();

    class Monkey {
        void jump() {
            System.out.println("jumping");
        }

        void bite() {
            System.out.println("biting");
        }
    }

    class human extends Monkey implements basicanimal {
        void Speak() {
            System.out.println("hello sir");
        }

        public void eat() {
            System.out.println("eating");
        }

        public void sleep() {
            System.out.println("sleeping");
        }
    }


    public class AbstractandInerface_problem60 {
        public static void main(String[] args) {
            //Q1 and Q2 answer
            FountedPen pen = new FountedPen();
            pen.changenib();
            //Q3 answer
            human sam = new human();
            sam.eat();
            sam.Speak();
            sam.bite();
            sam.eat();
            sam.sleep();
//question5
            Monkey m1 = new human();
            m1.bite();
            m1.jump();
          //  m1.speak(); cant use speak method because reference is monkey which doesn have speak method
            basicanimal bs = new human();
           // bs.speak(); ==error
            bs.eat();
            bs.sleep();
        }
    }
}