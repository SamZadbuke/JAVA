
import javax.swing.*;

public class Switch_ATM {
    public static void main(String[] args) {
        int bal =10000;
        String ch = JOptionPane.showInputDialog(" press D for deposit");

        switch(ch)
        {
            case "d":
            case "D":String Damt = JOptionPane.showInputDialog("Enter deposit amount");
            bal = bal + Integer.parseInt(Damt);
                System.out.println("After depositing your balance is" + bal);
                break;

            case "w":
            case "W":String Wamt = JOptionPane.showInputDialog("Enter Withdrowal");
            bal =bal -Integer.parseInt("Wamt");
                System.out.println("Your balance is" +bal);
                break;

            case "b":
            case "B":
                System.out.println("Your balance is" +bal);
                break;
            case "e":
            case "E":
                System.out.println("Thank You");
                break;
            default:
                System.out.println("Invalid Choice");

        }
    }
}

