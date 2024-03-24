
class ek {
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    ek(int v) {
        a = v;
    }

    public int sam() {
        return 1;
    }
}

    class doclass extends ek {
        doclass( int c){
            super(c);
            System.out.println("i am constructor ");
        }
    }

public class thisandsuperkeyword47 {
    public static void main(String[] args) {
ek hi = new ek (46);
        System.out.println(hi.getA());
        doclass sam = new doclass(5);
    }
}
