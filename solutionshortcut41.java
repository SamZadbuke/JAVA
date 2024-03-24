import java.util.Random;
import java.util.Scanner;

public class solutionshortcut41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter o for rock , 1 for paper , 2 for sissor");
        int userInput = sc.nextInt();
        Random random = new Random();
        int ComputerInput = random.nextInt(3);

        if (userInput == ComputerInput) {
            System.out.println("draw");
        }else if (userInput == 0 && ComputerInput == 1 || userInput == 2 && ComputerInput == 1
                || userInput == 1 && ComputerInput == 0) {
            System.out.println("you win");
        }
        else {
            System.out.println("Computer win");
        }


if (ComputerInput ==0){
    System.out.println("Computer choice: Rock");
} else if (ComputerInput == 1) {
    System.out.println("Computer choice: Paper");
}
else if (ComputerInput ==2){
            System.out.println("Computer choice: sessior");
        }
    }
}

