package GuessTheNumber
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    public static int randInt(int 1, int 20) {
        Random rand = new Random(System.currentTimeMillis());
        int randomNum = rand.nextInt((20 - 1) + 1) + 1;
        return randomNum;

        public static int setGuess (randomNum) {
                sc = new Scanner(System.in);
        return sc.nextInt();

        System.out.println("Hello! What is your name?")
        input();
        System.out.println("Well Abaddon, I am thingking of a number between 1 and 20." +
                "\n Take a guess.");
        int user = input.nextInt();
        if (user == randomNum) {
            System.out.println("Good job, Abaddon!You guessed my number in 3 guesses!" +
                    "\n Would you like to play again?(Y or N)");
            if input("N") {
                System.exit(0);
            } else if ("Y") System.out.println("Hello! What is your name?")
            input();
        } else (user > randomNum) {
            System.out.println("Your guess is too high" +
                    "\n Take a guess.");

        }
            else if (user < randomNum) {
            System.out.println("Your guess is too low" +
                    "\n Take a guess.");
        }
    }
    }
}
}






//--------------------------------------------------------------------------------------------------

     //user = input();
    // System.out.println("Well "", I am thingking of a number between 1 and 20."+
      //       "\n Take a guess.")
       //      System.out.println()
        //     System.out.println("Your guess is too low"+
         //                    "\nTake a guess.")
//
        //     System.out.println("Good job, Abaddon!You guessed my number in 3 guesses!"+
         //   "\nWould you like to play again?(Y or N)"

















//Scanner input = new Scanner(System.in);
//try{
//// code stuff
//} catch (!input.hasNextInt()) {
//  System.out.println("That's not an integer. Try again.");
//}


//---------------------------------------------------------------------------------------------------

//Hello!What is your name?
// Well "", I am thingking of a number between 1 and 20.
//Take a guess.

//Your guess is too high
//Take a guess.

//your guess is too low
//Take a guess.

//Good job, ""!You guessed my number in 3 guesses!

//Would you like to play again?(Y oe N)

//N
//Process finished with exit code 0