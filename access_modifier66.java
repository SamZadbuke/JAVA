class c1 {
    public int x = 0;
    protected int y = 1;
    int z = 2;
    private int a = 3;

    public void meth1() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);

    }
}
class c2 extends c1{
    public void main(String[] args) {
      //  System.out.println(a);
    }
}

public class access_modifier66 {
    public static void main(String[] args) {
c1 c = new c1();
c2 c1 = new c2();
//c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
//        System.out.println(c1.a); this has private accces cant use in subclass
       // System.out.println(c.a); this has private acccess cant use in same package
    }
}
