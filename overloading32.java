public class overloading32 {
//    static void change2 (int [] a){
//        a[0] =11;
//    }
//     static void change (int a){
//         a=98;
//    }
//    static void  telljokes(){
//        System.out.println( "hi i am sam");
//
//    }
//    public static void main(String[] args) {
////        telljokes();
////        int [] marks = {1,2,3,4,5};
////        int x = 1;
////        change(x);
////        System.out.println("the vale of x after cahnge:" + x);
//        int [] marks = {1,2,3,4,5};
//        change2(marks);
//       System.out.println("the vale of x after cahnge:" + marks[0]);
    static void foo(){
        System.out.println(" hi bro ");
            }
             static void foo( int a){
                 System.out.println(" hi bro " +  a  +  " hello ");
             }
    static void foo( int a,int b){
        System.out.println(" hi bro " +  a  + " hello ");
    }
    public static void main(String[] args) {
foo();
foo(2000);
foo(3000,4000);
    }
}

