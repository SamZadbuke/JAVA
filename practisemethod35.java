public class practisemethod35 {
    //problem 1
//    static int multiplication(int n) {
//        for(int i =0; i<10;i++){
//            System.out.format("%d * %d = %d\n" , i, n, i*n);
//        }
//        return 0;
//    }
//    public static void main(String[] args) {
//       multiplication(7);

//    }
    //problem2
//    static void pattern(int n){
//        for (int i =0 ; i<n ; i++){
//            for ( int j=0; j<i+1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
// pattern(10);
//}
    //problem 3
//    static int sumrec(int n){
//if (n==1){
//    return 1;
//        }
//else {
//    return n + sumrec(n-1);
//}
//    }
//
//    public static void main(String[] args) {
//        int c = sumrec(5) ;
//        System.out.println(c);
//    }

    //problem 4
//    static int fab(int n){
//        if (n==1 || n==2){
//            return n-1;
//        }
//        else {
//            return fab(n-1) + fab(n-2);
//        }
//    }
//
//    public static void main(String[] args) {
//        int result = fab(5);
//        System.out.println(result);
//    }
    //problem 8
    static void patternrec(int n) {
        if (n > 0) {
            patternrec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        patternrec(5);
    }
}



