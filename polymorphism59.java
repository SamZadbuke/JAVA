interface mycamera1{
    void snapshot();
    void  video();

    default void record4kvideo(){

        System.out.println(" record snap");
    }
}
interface Mywifi1{
    String[] network();
    void connectnetwork( String network);

}
class cellphones1 {
    void callnumber(int phonenumber) {
        System.out.println("calling" + phonenumber);
    }

    void pickcall() {
        System.out.println("connecting...");
    }
}

class smartphone1 extends cellphones1 implements Mywifi1,mycamera1{
    public void snapshot(){
        System.out.println("taking a snap");
    }
    //    public void record4kvideo(){
//        System.out.println(" record snap video");
//
//    }
    public void  video(){
        System.out.println("create video");
    }
    void callnumber(int phonenumber) {
        System.out.println("calling" + phonenumber);
    }
    public String[] network(){
        System.out.println(" getting list of network");
        String [] networklist ={"idea","vodafone"};
        return networklist;
    }
    public void connectnetwork( String network){
        System.out.println("connecting to " + network);
    }
    public void SampleMeth(){
        System.out.println("meth");
    }
}


public class polymorphism59 {
    public static void main(String[] args) {
        mycamera1 my1 = new smartphone1();
//        my1.network();not allowed
//        my1.SampleMeth(); not allowed
        my1.record4kvideo();
        smartphone1 sm = new smartphone1();
        sm.SampleMeth();
        sm.network();
        sm.record4kvideo();
        sm.callnumber(72496);
        sm.video();

    }
}
