
    class Employee {
        int id;
        String name;
     int Salary;

        public void printDetails() {
            System.out.println(" my id is " + id );
            System.out.println(" my name is " +  name );
            System.out.println(" my name is " +  Salary);
            }
        public int getSalary(){
            return Salary;

        }
    }
        public class op38 {
            public  static void main(String[] args) {
                System.out.println(" this the class ");
                Employee harry = new Employee();
                Employee sam = new  Employee();
                harry.id = 1;
                harry.name = " hello ";
                harry.Salary = 55;
                sam.id = 2;
                sam.name = " sgh ";
                sam.Salary = 272;
                harry.printDetails();
                sam.printDetails();;
                System.out.println(sam.Salary);


        }
    }


