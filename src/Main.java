import java.util.Scanner;

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
            System.out.println("TODO: castle");

        } else if(input.equals("r")) {
            System.out.println("TODO: Happy end");

        } else {
            System.out.println("Please answer the prompt correctly next time.");
            System.out.println("YOU LOSE!!");
        }

        in.close();
    }
}
