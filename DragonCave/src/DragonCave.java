package cave;
import java.util.Scanner;
public class DragonCave {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
        System.out.println("You are in a land full of dragons. In front of you,you see two caves. In one cave,"+
                        "\n you see two caves in onE cave the dragon is friendly"+
                        "\n and will share his treasure with you. the other dragon"+
                        "\n is greedy and hungry and will eat you on sight." +
                         "\nwhich cave will you go into?(1 OR 2)");
        int user = input.nextInt();
        if(user == 1){
            System.out.println("You approach the cave..."+
                    "\n n It is dark and spooky..."+
                    "\n A large dragon jumps out in front of you! He opens his jaws and..."+
                    "\n Gobbles you down in one bite!");
            System.exit(0);
        }
        else if (user==2){
            System.out.println("You approach the cave..."+
                    "\n Your eyes are blinded by the brightness of all the treasure..." +
                    "\n and you see the friendly dragon, who invites you to take some treasure.");
            System.exit(0);
        }
        else{
            System.out.println("An old,powerful wizard with a long white beard appears saying, Incorrect entry.YOU SHALL NOT PASS!");
            System.exit(0);
        }
  }
}
//you see two caves in onE cave the dragon is friendly"
//and will share his treasure with you. the other dragon"
//is greedy and hungry and will eat you on sight.
//
//"You approach the cave..."+
//"/n It is dark and spooky..."
//A large dragon jumps out in front of you! He opens his jaws and..."
//Gobbles you down in one bite!");

//Your eyes are blinded by the brightness of all the treasure..."
//"/n and you see the friendly dragon, who invites you to take some treasure.");

//An old,powerful wizard with a long white beard appears saying, Incorrect entry.YOU SHALL NOT PASS

//public static String Cave(int choice){
//        if (choice == 1) {
//            return "You approach the cave..." + "\n" +" It is dark ans spooky..." + "/n" + "A large dragon jumps out"
//        }
//        if (choice==2){
//            return "You got treasure from dragon!";
//        }
//        return null
//    }






//   int user = input.nextInt()
//        try {
//            Scanner getInput = new Scanner(System.in);
//            int choice = getInput.nextInt();
//            System.out.println(Cave(choice));
//        }catch(Exception e){
//            System.out.println("Exeption: Wrong cave");
//        }