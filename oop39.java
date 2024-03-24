//
//    class Employee1 {
//        int Salary;
//        String name;
//        public int getSalary() {
//return Salary;
//    }
//    public String getName(){
//       return name;
//    }
//public void  setName(String n){
//      name = n;
//}
//    }
////    public class oop39 {
////        public static void main(String[] args) {
//            Employee1 sam = new Employee1();
//            sam.setName("harryamam");
//            sam.Salary = 33;
//            System.out.println(sam.getSalary());
//            System.out.println(sam.getName());


//        class Cellphone {
//            public void ring() {
//                System.out.println("ringing");
//            }
//
//            public void vibrate() {
//                System.out.println("vibrate");
//            }
//
//            public void callfriend() {
//                System.out.println("call to sam");
//
//            }
//        }
//    public class oop39 {
//        public static void main(String[] args) {
//            Cellphone moto = new Cellphone();
//            moto.ring();
//            moto.vibrate();
//            moto.callfriend();
//        }
//    }

//
//    class Square{
//   int side;
//   public int area(){
//       return side*side;
//    }
//    public int parameter(){
//       return 4*side;
//    }
//    }
//public class oop39 {
//    public static void main(String[] args) {
//        Square sq = new Square();
//        sq.side = 5;
//        System.out.println(sq.area());
//        System.out.println(sq.parameter());
//    }
//
//}
class  Tommy{
    public void  run(){
        System.out.println("running");
    }
    public void fire(){
        System.out.println("fireing");
    }
    public void hit(){
        System.out.println("hittting");
    }
    public static void main(String[] args) {
Tommy Player1 = new Tommy();
Player1.fire();
Player1.hit();
Player1.run();
    }
}

