package fr.atlas;

import java.util.ArrayList;
import java.util.Scanner;

public class Bibliotheque implements Empruntable {
    public Scanner scanner;
    ArrayList<Membre> _membres;
    ArrayList<Livre> _livres;

    public Bibliotheque() {
        this.scanner = new Scanner(System.in);
        this._membres = new ArrayList<Membre>();
        this._livres = new ArrayList<Livre>();
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

    public void ajouterUnLivre() {
        System.out.print("\nEntrez le titre du livre : ");
        String titre = scanner.nextLine();

        System.out.print("Entrez le nom de l'auteur : ");
        String auteur = scanner.nextLine();

        System.out.print("Entrez l'état du livre : ");
        boolean etat = Boolean.parseBoolean(scanner.next());

        System.out.print("Entrez l'année de publication : ");
        int annee = scanner.nextInt();

        _livres.add(new Livre(titre, auteur, etat, annee));
        System.out.println("Votre livre à été ajouté!");
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
                emprunter();
                break;

            case 2:
                retourner();
                break;

            default:
                System.out.println("Votre choix est invalide : ");
                break;
        }
    }

    @Override
    public void emprunter() {
        System.out.print("Entrez le nom du livre à emprunter : ");
        String nomLivre = scanner.nextLine();

        for (Livre livre : _livres) {
            if (livre.getNomLivre().contains(nomLivre)) {
                System.out.println("oui");
            }
        }
        throw new UnsupportedOperationException("Méthode 'emprunter' non implémentée");
    }

    @Override
    public void retourner() {
        throw new UnsupportedOperationException("Méthode 'retourner' non implémentée");
    }

    @Override
    public boolean estEmprunte() {
        throw new UnsupportedOperationException("Méthode 'estEmprunter' non implémentée");
    }
}
