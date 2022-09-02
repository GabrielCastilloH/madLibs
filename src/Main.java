import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String noun;
        String adjective;
        String verb;
        String random;


        System.out.println("Enter a noun!");
        Scanner nounInput = new Scanner(System.in);
        noun = nounInput.nextLine();

        System.out.println("Enter an adjective!");
        Scanner adjectiveInput = new Scanner(System.in);
        adjective = adjectiveInput.nextLine();

        System.out.println("Enter a verb in past tense (for example ran)!");
        Scanner verbInput = new Scanner(System.in);
        verb = verbInput.nextLine();

        System.out.println("Enter a random whatever!");
        Scanner randomInput = new Scanner(System.in);
        random = randomInput.nextLine();

        System.out.println("\nThe huge " + adjective + " " + noun + " called Smiley " + verb + " all night long. It got so exited it yelled " + random + "!");
    }
}
