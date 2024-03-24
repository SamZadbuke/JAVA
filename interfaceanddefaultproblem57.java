interface mycamera{
    void snapshot();
void  video();

default void record4kvideo(){

        System.out.println(" record snap");
    }
}
interface mywifi{
   String[] network();
    void connectnetwork( String network);

}
class cellphones {
    void callnumber(int phonenumber) {
        System.out.println("calling" + phonenumber);
    }

    void pickcall() {
        System.out.println("connecting...");
    }
}

class smartphone extends cellphones implements mywifi,mycamera{
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
}


public class interfaceanddefaultproblem57 {
    public static void main(String[] args) {
smartphone ms  = new smartphone();
ms.record4kvideo();
ms.network();
String [] ar =ms.network();
        for (String item :ar) {
            System.out.println(item);
            
        }
    }
}
