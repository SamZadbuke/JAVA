abstract class parent1{
    public parent1(){
        System.out.println("hi");
    }
    public void hello(){
        System.out.println("hello");
    }
    abstract public void sam();
    abstract public void anu();

}
 class child1 extends parent1 {
     public void sam() {
         System.out.println("hiii");
     }

     public void anu() {
         System.out.println("anu");
     }
 }
    abstract class child2 extends parent1{
public void th(){
    System.out.println("he");
}
}

public class abstract53 {
    public static void main(String[] args) {

child1 c1 = new child1();
    }
}
