import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int InputNmuber;
    public int noofguesses = 0;

    public int getNoOfguesses() {
        return noofguesses;
    }

    public void setNoofguesses(int noofguesses) {
        noofguesses = noofguesses;
    }

    Game() {
        Random random = new Random();
        number = random.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("choice number ");
        Scanner sc = new Scanner(System.in);
        InputNmuber = sc.nextInt();

    }

    boolean isCorrectNumber() {
        noofguesses++;
        if (InputNmuber == number){
            System.out.format("yes you guessed right number,it was %d\n you guesed it in %d attempts:", number,noofguesses);

    }
else if(InputNmuber<number)

    {
        System.out.println("low");
    }
else if(InputNmuber>number)

    {
        System.out.println("high");
    }
return false;
}
}



public class guessnumbergame43 {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b =false;
        while(!b){

            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);
        }
    }

}




