import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your adventurer's name: ");
        String name = in.nextLine();

        System.out.println("Welcome adventurer " + name + ", I hope you survive the brutal challenge that awaits!");

        System.out.println("There is a tall and foreboding castle in front of you.");
        System.out.print("Do you enter the (c)astle or (r)un away? ");
        String input = in.nextLine();

        if(input.equals("c")) {
            System.out.println("As you enter the castle you find a large dragon waiting for you!");
            System.out.print("Do you (a)ttack the dragon or (e)xplain that you're here to fix the printer? ");
            input = in.nextLine();

            if(input.equals("a")) {
                System.out.println("You hopelessly try to attack the dragon.");
                System.out.println("The dragon breathes fire and does over 9000 damage!");
                System.out.println("As you lie there dying the dragon says to you: 'git gud'");
                System.out.println("With your last dying breath you reply:\n'git: 'gud' is not a git command. See 'git --help'.'");
                System.out.println("YOU LOSE!!");

            } else if(input.equals("e")) {
                System.out.println("The dragon lets out a small ring of smoke to let you know it appreciates that someone has finally come to fix it and lets you continue.");
                System.out.println("As you rush up the stairs to get the highest room in the tallest tower you find...");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch(Exception e) {
                    e.printStackTrace();
                }
                System.out.println("...");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch(Exception e) {
                    e.printStackTrace();
                }
                System.out.println("A sign saying: 'Your princess is in another castle!'");
                System.out.println("BAD ENDING!!");
            }

        } else if(input.equals("r")) {
            System.out.println("Looking defeated you begin to walk about from the castle.");
            System.out.println("After a few hours walking you begin to see a small patrol of guards in the distance.");
            System.out.println("As you approach them you see that they are carrying the princess with them.");
            System.out.println("You perform some awesome karate moves and knock out all the guards.");
            System.out.println("Congratulations, you've saved the princess!");
            System.out.println("GOOD ENDING!!");

        } else {
            System.out.println("Please answer the prompt correctly next time.");
            System.out.println("YOU LOSE!!");
        }

        in.close();
    }
}
