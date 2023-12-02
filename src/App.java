import fr.atlas.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Bibliotheque bibliotheque = new Bibliotheque();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans la bibliotheque de Atlas que voulez vous faire !");
        System.out.println("--------------------------------\n");

        System.out.println("1. Créer un compte :");
        System.out.println("2. Se conecter :");
        System.out.println("3. Emprunter un livre :");
        System.out.println("4. Rendre un livre :");
        System.out.println("5. Voire la iste des livre :");

        System.out.print("\nEntrez  votre choix : ");
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                bibliotheque.ajouterMembre();
                break;

            default:
                System.out.println("Votre choix est invalide !!!");
                break;
        }
    }
}
