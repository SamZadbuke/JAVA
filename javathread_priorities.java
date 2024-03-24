class Mythr1 extends Thread {
    public Mythr1(String name) {
        super(name);
    }

    public void run() {
        int i = 10;
//        while (true) {
//            System.out.println("i am thread");
            System.out.println("thank you:" + getName());
//        }
    }

}

    public class javathread_priorities {
        public static void main(String[] args) {
            Mythr1 Th1 = new Mythr1("sam1");
            Mythr1 Th2 = new Mythr1("sam2");
            Mythr1 Th3 = new Mythr1("sam3");
            Mythr1 Th4 = new Mythr1("sam4");
            Mythr1 Th5 = new Mythr1("sam5");
            Th1.setPriority(Thread.MAX_PRIORITY);
            Th5.setPriority(Thread.MIN_PRIORITY);
            Th3.setPriority(Thread.MIN_PRIORITY);
            Th4.setPriority(Thread.MIN_PRIORITY);

            Th1.start();
            Th2.start();
            Th3.start();
            Th4.start();
            Th5.start();

        }
    }

