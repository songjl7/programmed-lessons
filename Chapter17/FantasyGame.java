import java.util.Scanner;

public class FantasyGame{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter character name");
        String name = scanner.nextLine();
        System.out.println("Enter strength (1-10)");
        int strength = scanner.nextInt();
        System.out.println("Enter health (1-10)");
        int health = scanner.nextInt();
        System.out.println("Enter luck (1-10)");
        int luck = scanner.nextInt();

        if (strength + health + luck > 15) {
            strength = 5;
            health = 5;
            luck = 5;
            System.out.println("You gave your character too many points! Default values have been assigned,");
            System.out.println("Name: " + name + "\nStrength: " + strength + "\nHealth: " + health + "\nLuck: " + luck);
        } else {
            System.out.println("Name: " + name + "\nStrength: " + strength + "\nHealth: " + health + "\nLuck: " + luck);
        }
    }
}