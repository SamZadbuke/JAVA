class thread1 extends Thread {
    public void run(){
        int i=0;
        while (i<100){
            System.out.println("cooking threading");
            System.out.println("i am happy");
            i++;
        }
    }
}
class thread2 extends thread1 {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("chatting threading");
            System.out.println("i am sad");
            i++;
        }
    }
}
       public class createthreadby_extendingthread70 {
            public static void main(String[] args) {
thread1 th = new thread1();
thread2 th1 = new thread2();
th.start();
th1.start();
            }
        }
