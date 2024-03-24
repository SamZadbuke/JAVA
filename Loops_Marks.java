import javax.swing.*;

public class Loops_Marks {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Name");
        String S =JOptionPane.showInputDialog("Enter Age");
        int Age = Integer.parseInt(S);
        if (Age >=25 && Age <=30)
        {
            System.out.println(name + " is eligible for bank exam");
        }
        else
        {
            System.out.println(name + "is not eligible for bank exam");

        }

    }
}
