
public class sam38 {


    class Employe {
        int id;
        String name;
        int salary;

        public void printdetails() {
            System.out.println("my id is" + "id");
            System.out.println("my name is" + "name");

        }
        public class oop38 {
            public  void main(String[] args) {
                System.out.println("thi is the class");
                Employe harry = new Employe();
                Employe sam = new  Employe();
                harry.id = 1;
                harry.name = "hello";
                harry.salary = 55;
                sam.id = 2;
                sam.name = "sgh";
                sam.salary = 272;
                harry.printdetails();
                sam.printdetails();
            }

        }
    }

}
