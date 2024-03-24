//public class methods31 {
//
//        static int logic(int x, int y) {
//            int z;
//            if (x > y) {
//                z = x + y;
//            } else {
//                z = (x + y) * 5;
//            }
//            return z;
//        }
//             public static void main(String[] args) {
//            int a =1;
//            int b= 2;
//            int c;
//            c =logic(a,b);
//            int a1 =5;
//            int b1 =6;
//            int c1;
//            c1 = logic(a1,b1);
//                 System.out.println(c);
//                 System.out.println(c1);
//    }
//}

public class methods31 {

   int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a =1;
        int b= 2;
        int c;
        methods31 obj = new methods31();
        c =obj.logic(a,b);
        int a1 =5;
        int b1 =6;
        int c1;
        c1 = obj.logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}


