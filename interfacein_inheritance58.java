interface sample{
    void meth1();
    void meth2();
}
interface childsample extends sample{
    void meth3();
    void meth4();
}
class Mysample implements childsample{
    public void meth3(){
        System.out.println("method3");
    }

    public void meth4(){
        System.out.println("method4");
    }
   public void meth1(){
        System.out.println("method1");
    }
    public void meth2(){
        System.out.println("Method2");
    }
}


public class interfacein_inheritance58 {
    public static void main(String[] args) {
Mysample my = new Mysample();
my.meth1();
my.meth2();
my.meth3();
my.meth4();
    }
}
