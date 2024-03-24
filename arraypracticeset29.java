public class arraypracticeset29 {
    public static void main(String[] args) {
  //problem 2
//    float [] marks = {11.22f, 72.272f,22.33f,88.4f};
//    float  sum =0;
//    for(float element: marks){
//         sum = sum + element;
//    }
//
//        System.out.println("the value of sum is" + sum);
//    }
//}
//problem 2
//float [] marks = {11.22f, 72.272f,22.33f,88.4f};
//    float num =11.22f
//    boolean isInArray = false;
//    for(float element: marks) {
//        if (num == element) {
//            isInArray = true;
//            break;
//        }
//    }
//    if(isInArray) {
//            System.out.println("this number is in array");
//        }
//           else {
//               System.out.println("this array is not in array");
//           }
//problem 3
//        float [] marks = {11.22f, 72.272f,22.33f,88.4f};
//        float  sum =0;
//        for(float element: marks){
//            sum = sum + element;
//        }
//
//        System.out.println("the value average  is" + sum/ marks.length);


        //problem 4
//        int [][] math1 ={{1,2,3},
//                        {4,5,6}};
//        int [][] math2 = {{2,3,4},
//                          {3,4,5}};
//        int [][] result ={{0,0,0},
//                          {0,0,0}};
//      for ( int i=0;i< math1.length;i++){
//          for (int j=0;j<math1[i].length;j++){
//              System.out.format("setting value for i=%d and j%d\n", i,j);
//              result[i][j]= math1[i][j] + math2[i][j];
//          }
//      }
//
//        for ( int i=0;i< math1.length;i++){
//            for (int j=0;j<math1[i].length;j++){
//                System.out.print(result[i][j] + " ");
//                result[i][j]= math1[i][j] + math2[i][j];
//            }
//            System.out.println("");
//        }

//problem 5
//        int [] a ={1,2,3,4,5};
//        int l = a.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//        for(int i =0; i<n;i++){
//            //swap a[i] and a[l-i-1]
//            //|4| |3| ||
//            temp=a[i];
//            a[i]=a[l-i-1];
//            a[l-i-1]=temp;
//        }
//        for (int element:a){
//            System.out.println(element + "");
////        }
//        int [] a ={1,2,3,4,5};
//        int max=0;
//        for (int e:a){
//            if(e>max){
//                max=e;
//            }
//        }
//        System.out.println("the maximum value in the a is: " + max);
//problem 7
        boolean issorted=true;
        int [] a ={1,2,3,4,5};
        for( int i=0 ; i<a.length-1;i++) {
            if (a[i] > a[i + 1]) {
                issorted = false;
                break;
            }
        }
            if(issorted){
                System.out.println("this is soretd array");
            }
            else
                System.out.println("this is not sorted array");

        }
        }



