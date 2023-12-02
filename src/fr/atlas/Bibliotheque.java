package fr.atlas;

import java.util.ArrayList;
import java.util.Scanner;

public class Bibliotheque {

    public Scanner scanner;
    ArrayList<Membre> _membres;

    public Bibliotheque() {
        this.scanner = new Scanner(System.in);
        this._membres = new ArrayList<Membre>();
    }

    public void ajouterMembre() {
        System.out.print("\nEntrez votre nom d'utilisateur : ");
        String nomUtilisateur = scanner.nextLine();

        System.out.print("Entrez votre email : ");
        String email = scanner.nextLine();

        System.out.print("Entrez votre mot de passe : ");
        String password = scanner.nextLine();

        _membres.add(new Membre(nomUtilisateur, email, password));
        System.out.println("Votre compte à été créer !");
    }

    public void connecterUnMenbre() {
        System.out.print("\nEntrez votre d'utilisateur : ");
        String nomUtilisateur = scanner.nextLine();

        for (Membre membre : _membres) {
            if (membre.getmNomUtilisateur().contains(nomUtilisateur)) {
                System.out.print("Entrez votre mot de passe : ");
                String password = scanner.nextLine();

                if (membre.getmPassword().equals(password)) {
                    System.out.println("\nVous êtes connecté!");
                    System.out.println("Bienvenue " + membre.getmNomUtilisateur());
                } else {
                    System.out.println("Votre mot de passe est invalide!");
                }
            } else {
                System.out.println("Votre compte n'existe pas!");
            }
        }

        System.out.println("\n--------------------------------");
        System.out.println("Que voulez vous faire : ");

        System.out.println("\n1. Emprunter un livre :");
        System.out.println("2. Rendre un livre :");
        System.out.println("3. Voire la iste des livre :");

        System.out.print("Entrez votre choix : ");
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                System.out.println(123);
                break;

            default:
                System.out.println("Votre choix est invalide : ");
                break;
        }
    }
}
