//class cyliender {
//    private int radius;
//    private int height;
//
//    public cyliender(int radius, int height) {
//        this.radius = radius;
//        this.height = height;
//    }
//
//    public int getRadius() {
//        return radius;
//    }
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }

    //    public double surfacearea(){
//        return  2 * 3.14 * radius * radius + 2*3.14 *radius *height;
//
//    }
//    public double surfacearea() {
//        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
//    }
//
//    public double volume() {
//        return Math.PI * radius * radius * height;
//    }
//}
class rectangle {
    private int length;
   private int breadth;

    public rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}


public class practiceaccessmodifierandconstructor {
    public static void main(String[] args) {
        // problem 1
//     cyliender sc = new cyliender(35,34);
    // sc.setHeight(34);
   //sc.setRadius(35);
//        System.out.println(sc.getHeight());
//      System.out.println(sc.getRadius());
//        System.out.println(sc.surfacearea());
//        System.out.println(sc.volume());
rectangle re =  new rectangle();
        System.out.println(re.getBreadth());
        System.out.println(re.getLength());
    }
}
