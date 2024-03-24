class a {
    int a;

    public int hi() {
        return 5;
    }

    public void meth2() {
        System.out.println("I am method 2 of class a ");
    }
}

class b extends a{

public void meth3(){
    System.out.println("i am meth 3 of class b");
            }
    public void meth2(){
        System.out.println("I am method 2 of class b ");
    }
        }

public class methodoverriding48 {
    public static void main(String[] args) {
a A = new a();
A.meth2();
b B = new b();
B.meth2();
    }
}
