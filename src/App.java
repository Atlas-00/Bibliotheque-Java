import fr.atlas.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Bibliotheque bibliotheque = new Bibliotheque();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans la bibliotheque de Atlas que voulez vous faire !");
        System.out.println("--------------------------------");
        boolean quitterBoucle = false;

        do {
            System.out.println("\n1. Créer un compte :");
            System.out.println("2. Se conecter :");
            System.out.println("3. Ajouter un livre : ");
            System.out.println("4. Quitter : ");

            System.out.print("\nEntrez  votre choix : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    bibliotheque.ajouterMembre();
                    break;

                case 2:
                    bibliotheque.connecterUnMenbre();
                    break;

                case 3:
                    bibliotheque.ajouterUnLivre();
                    break;

                case 4:
                    quitterBoucle = true;
                    System.out.println("Vous quitter le programme");
                    break;

                default:
                    System.out.println("Votre choix est invalide !!!");
                    break;
            }
        } while (!quitterBoucle);
    }
}
