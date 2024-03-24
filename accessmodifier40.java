
class MyEmployee{
    int id;
    String name;
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return  id;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}

public class accessmodifier40 {
    public static void main(String[] args) {
MyEmployee Sam = new MyEmployee();
    Sam.setName("hello");
        System.out.println(Sam.getName());
        Sam.setId(67);
        System.out.println(Sam.getId());
    }
}
