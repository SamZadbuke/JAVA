class circle {
    public int radius;

    circle() {

  System.out.println(" i am non constructor");
}
    circle(int r) {

        System.out.println("i am constuctor");
        this.radius = r;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}

class cylender extends circle{
    public int height;
    cylender(int r ,int h){
//        super(r);
        System.out.println("i am cylender constuctor");
        this.height=h;

    }
    public double volume(){
        return Math.PI*this.height*this.radius*this.radius;
    }
}
public class inheritancepractice52 {
    public static void main(String[] args) {
circle ci = new circle(12);
cylender cy = new cylender(4,6);
    }
}
