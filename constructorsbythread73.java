class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        int i =30;
        System.out.println("thank you");
//        while (true){
//            System.out.println("i am thread");
//        }
    }

}


public class constructorsbythread73 {
    public static void main(String[] args) {
Mythr Th1 = new Mythr("sam");
Mythr Th2 = new Mythr("anu");
Th1.start();
Th2.start();
        System.out.println("the id of thread is " + Th1.getId());
        System.out.println("the name of thread is " + Th1.getName());
        System.out.println("the id of thread is " + Th2.getId());
        System.out.println("the name of thread is " + Th2.getName());

    }
}
