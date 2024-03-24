class base{
   public  int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void base() {
        System.out.println("i am constructor");
    }
}
class derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}



public class inheritance45 {
    public static void main(String[] args) {
        //creating an object of base class
 base b = new base();
 b.setX(5);
        System.out.println(b.getX());

        //creating an object of derived class
        derived d = new derived();
        d.setX(10);
        System.out.println(d.getY());
    }

}
