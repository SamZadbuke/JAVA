public class If_Marks {
    public static void main(String[] args) {
        int OOMD = 70;
        int CC = 80;
        int total = OOMD + CC ;
        double per = total/2;
        System.out.println("total marks is" +total);
        if (OOMD >= 730 && CC >= 160)
        {
            System.out.println("student is pass");
            System.out.println("percentage is" +per);
            if (per>=60)
            {
                System.out.println("student pass with first class");

            }
        }
        else
        {
            System.out.println("student is fail");
        }
    }
}
