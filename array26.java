public class array26 {
    public static void main(String[] args) {
     //1st method
//        int[] marks;
//      marks = new int [5];
//       marks [0] = 10;
//       marks[1] = 20;
//        marks[3] = 30;
//        System.out.println(marks[1]);
//        System.out.println(marks.length);
//      //2nd method
//      int [] total = new int [2];
//      total[0]=0;
//      total[1] =1;
//        System.out.println(total[1]);
//      //3rd method
//      int [] num = {20,10,40,40};
//        float [] sum  = {20,10,40,40};
//        System.out.println(num[1]);
//      String [] students ={"sam" ,"abhi", "anku","sjss"};
//        System.out.println(students[1]);
//        System.out.println(students.length);
//        for (int i =0;i<students.length;i++){
//            System.out.println(students[i]);
//        }
//        System.out.println("using the for loop");
//        for (int i=0 ; i< marks.length;i++) {
//            System.out.println(marks[i]);
//        }
//        //Array in reverse order
//        for (int i = marks.length-1;i>=0;i--){
//            System.out.println(marks[i]);
//        }
//        //quick quiz: displying the array (for each loop)
//        System.out.println("printing the following for each loop");
//        for( int element: marks){
//            System.out.println(element);
//    }
//       int []  marks = new int[]   for 1D array
         int [] marks;
            int [][] flats;
        flats = new int [2][3];
        flats [0][0]=101;
        flats [0][1]= 102;
        flats [0][2]=103;
        flats [1][0]=201;
        flats [1][1]=202;
        flats [1][2]=203;

        System.out.println("using the for loop for 2D array ");
        for (int i=0 ; i< flats.length;i++){
            for( int j=0; j< flats[i].length ;j++){
            System.out.print(flats[i][j]);
                System.out.print(" ");
        }
        System.out.println("\n");
    }
}
}