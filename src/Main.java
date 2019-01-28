import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your adventurer's name: ");
        String name = in.nextLine();

        System.out.println("Welcome adventurer " + name + ", I hope you survive the brutal challenge that awaits!");

        in.close();
    }
}
