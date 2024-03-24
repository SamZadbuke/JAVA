class one1{
public void name(){
    System.out.println("my name is java");
}
public void  hi(){
    System.out.println("good mornong");
}
        }
        class two extends one1{
    public void name(){
        System.out.println("my name is java class 2");
    }
    public void hello(){
        System.out.println(" welcome");
    }
        }

public class dynamicmethoddispatch49 {
    public static void main(String[] args) {
//one1 sam = new one1();
//sam.name();
one1 so = new two();
so.hi();
so.name();
    }
}
