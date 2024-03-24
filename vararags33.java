public class vararags33 {
//    static int sum (int ...arr){
//        int result =0;
//        for( int  e:arr){
//            result += e;
//        }
//        return result;
//    }
//    public static void main(String[] args) {
//        System.out.println("welcome to vararges tutorial");
//        System.out.println("the sum of nothing is:" + sum());
//        System.out.println("the sum of nothing is:" + sum(1));
//        System.out.println("the sum of 4 and 5:"  + sum(4,5));
//        System.out.println("the sum of 4,5 and 6:"  + sum(4,5,6));
//    }
    static int sum (int x, int ...arr){
        int result =x;
        for( int  e:arr){
            result += e;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("welcome to vararges tutorial");
//        System.out.println("the sum of nothing is:" + sum());
        System.out.println("the sum of nothing is:" + sum(1));
        System.out.println("the sum of 4 and 5:"  + sum(4,5));
        System.out.println("the sum of 4,5 and 6:"  + sum(4,5,6));
    }
}
