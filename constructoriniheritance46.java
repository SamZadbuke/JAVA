
class base1 {
    base1() {
        System.out.println(" i am a constructor ");
    }

    base1(int x) {
        System.out.println(" i am a overloaded constructor with value of x as: " + x);
    }


    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

  class Derived1 extends base1 {
      //     public int y;
      Derived1() {
//            super(0);
          System.out.println("i am derived constructor");
      }

      Derived1(int x, int y) {
          super(x);
          System.out.println(" i am a overloaded constructor of Derived with value of b as: " + y);

      }

//              public int getY() {
//            return y;
//        }
//
//        public void setY(int y) {
//            this.y = y;
        }

//  }

class childofderived extends Derived1 {
    childofderived() {
        System.out.println(" i am child of derived class");
    }

    childofderived(int x, int y,int z) {
        super(x, y);
        System.out.println("i am overloaded costructor of derived with vale of z as:" + z);
    }
}
public class constructoriniheritance46 {
    public static void main(String[] args) {
//base1 bs = new base1();
//Derived1 ds = new Derived1();
childofderived cd = new childofderived();
    }
}
