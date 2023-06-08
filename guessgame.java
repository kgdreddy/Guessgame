import java.util.Random;
import java.util.Scanner;

class Game{
    int computer;
    public Game(){
        Random rand = new Random();
        computer = rand.nextInt(500);
        System.out.println("Guess the Number From  1 to 100");
    }
    public int computerNo(){
        return computer;
    }
}
public class guessgame {
    static int takeUserInput(){
        int user;
        System.out.println("ENTER THE NUMBER");
        Scanner sc= new Scanner(System.in);
        user=sc.nextInt();
        return user;
    }

    static void isCorrectNumber(int i, int j){
        if(i==j){
            System.out.println("THE NO YOU HAVE GUESSED IS EQUAL TO THE COMPUTERS NO");
        }
        else if(i>j){
            System.out.println("Your No. is greater than computers No.");
        }
        else if(i<j){
            System.out.println("Your No. is Smaller than computers No.");
        }
    }
    public static void main(String[] args) {
        int user=0,computer=0,itteration=0;
        Game g = new Game();
        do {
            user = takeUserInput();
            computer = g.computerNo();
            isCorrectNumber(user, computer);
            itteration++;
        }while (user!=computer);
        System.out.println("YOU have guessed the number in "+ itteration+" ITTERATIONS");
    }
}
