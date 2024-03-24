
 class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee() {
        name = "hi";
        id = 23;
    }

    public MyMainEmployee(String MyName, int Myid) {
        name = MyName;
        id = Myid;

    }

    public MyMainEmployee(String MyName) {
        name = MyName;
        id = 2;
    }
        public void setId ( int i){
            id = i;
        }

        public int getId () {
            return this.id;
        }
        public String getName () {
            return this.name;
        }
        public void setName (String n){
            name = n;
        }

        public static void main (String[]args){
            MyMainEmployee Sam = new MyMainEmployee();
//            Sam.setName("hello");
//            Sam.setId(43);
            System.out.println(Sam.getId());
            System.out.println(Sam.getName());
        }
    }

