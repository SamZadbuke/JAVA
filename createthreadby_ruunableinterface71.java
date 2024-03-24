class MyThreadRuunable1 implements Runnable{
    public void run(){
        System.out.println("i am thraec1 not thread2");
        System.out.println("i am thraec1 not thread2");
        System.out.println("i am thraec1 not thread2");
        System.out.println("i am thraec1 not thread2");
        System.out.println("i am thraec1 not thread2");
        System.out.println("i am thraec1 not thread2");
        System.out.println("i am thraec1 not thread2");
        System.out.println("i am thraec1 not thread2");
        System.out.println("i am thraec1 not thread2");
    }
}
class MyThreadRunnable2 implements Runnable {
    public void run() {
        System.out.println("i am thraec2 not thread1");
        System.out.println("i am thraec2 not thread1");
        System.out.println("i am thraec2 not thread1");
        System.out.println("i am thraec2 not thread1");
        System.out.println("i am thraec2 not thread1");
        System.out.println("i am thraec2 not thread1");
        System.out.println("i am thraec2 not thread1");
        System.out.println("i am thraec2 not thread1");
        System.out.println("i am thraec2 not thread1");
        System.out.println("i am thraec2 not thread1");
    }
}
public class createthreadby_ruunableinterface71 {
    public static void main(String[] args) {
MyThreadRuunable1 bullet1 = new MyThreadRuunable1();
Thread gun1 = new Thread(bullet1);
MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
