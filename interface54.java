interface cycle{
    int a =56;
    public void applybreak(int dercrement);
    public void speedup(int increment);
}
interface horncycle{
    int b  =59;
    public void blow();
    public void hiborn();
}
class bycycle implements cycle, horncycle{
    int b =6;
    void blowhorn(){
        System.out.println("pee");
    }
    public void applybreak(int decrement){
        System.out.println("apply braek");
    }
    public void speedup(int increment){
        System.out.println("apply speedup");
    }
    public void blow(){
        System.out.println("anuu");
    }
    public void hiborn(){
        System.out.println("anu");
    }
}
public class interface54 {
    public static void main(String[] args) {
bycycle hi = new bycycle();
hi.applybreak(7);
hi.speedup(6);
//you can create properties in interface but cant modify properties
      System.out.println(hi.b);
//      hi.blow();
//      hi.hiborn();

    }
}
