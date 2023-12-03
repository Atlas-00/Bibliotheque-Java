package fr.atlas;

import java.util.ArrayList;
import java.util.Scanner;

public class Bibliotheque implements Empruntable, Affichable {
    ArrayList<Membre> _membres;
    ArrayList<Livre> _livres;
    private Membre _membreActuel;

    public Bibliotheque() {
        this._membres = new ArrayList<Membre>();
        this._livres = new ArrayList<Livre>();
    }

    public void ajouterMembre() {
        Scanner scanner = new Scanner(System.in);

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
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEntrez le titre du livre : ");
        String titre = scanner.next();

        System.out.print("Entrez le nom de l'auteur : ");
        String auteur = scanner.next();

        System.out.print("Entrez l'année de publication : ");
        int annee = scanner.nextInt();

        _livres.add(new Livre(titre, auteur, true, annee));
        System.out.println("Votre livre à été ajouté!");
    }

    public void connecterUnMenbre() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEntrez votre nom d'utilisateur : ");
        String nomUtilisateur = scanner.nextLine();

        for (Membre membre : _membres) {
            if (membre.getmNomUtilisateur().contains(nomUtilisateur)) {
                System.out.print("Entrez votre mot de passe : ");
                String password = scanner.nextLine();

                if (membre.getmPassword().equals(password)) {
                    _membreActuel = membre; // Mette à jour _membreActuel
                    System.out.println("\nVous êtes connecté!");
                    System.out.println("Bienvenue " + _membreActuel.getmNomUtilisateur());
                } else {
                    System.out.println("Votre mot de passe est invalide!");
                }
            } else {
                System.out.println("Votre compte n'existe pas!");
            }
        }

        boolean deconnect = false;

        while (!deconnect) {
            System.out.println("\n--------------------------------");
            System.out.println("Que voulez vous faire : ");

            System.out.println("\n1. Emprunter un livre :");
            System.out.println("2. Rendre un livre :");
            System.out.println("3. Afficher tous les livre :");
            System.out.println("4. Voire mes emprunt");
            System.out.println("5. Me deconnecter :");

            System.out.print("\nEntrez votre choix : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    emprunter();
                    break;

                case 2:
                    retourner();
                    break;

                case 3:
                    afficher();
                    break;

                case 4:
                    livresEmpruntes();
                    break;

                case 5:
                    deconnect = true;
                    System.out.println("Vous vous êtes deconnectée !!!");
                    break;

                default:
                    System.out.println("Votre choix est invalide : ");
                    break;
            }
        }
    }

    @Override
    public void emprunter() {
        Scanner scanner = new Scanner(System.in);

        if (_livres.isEmpty()) {
            System.out.println("Aucun livre disponible!");
            return;
        }

        System.out.print("\nEntrez le nom du livre à emprunter : ");
        String nomLivre = scanner.nextLine();

        boolean livreTrouve = false;

        for (Livre livre : _livres) {
            if (livre.getNomLivre().contains(nomLivre) && livre.isEtat()) {
                livre.setEtat(false);
                _membreActuel.emprunter(livre);
                livreTrouve = true;
                break; // Sort de la boucle une fois que le livre a été emprunté
            }
        }

        if (!livreTrouve) {
            System.out.println("Ce livre n'existe pas ou n'est pas disponible!");
        }
    }

    @Override
    public void retourner() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEntrez le nom du livre à retourner : ");
        String nomLivre = scanner.nextLine();

        boolean livreTrouve = false;

        for (Livre livre : _livres) {
            if (livre.getNomLivre().contains(nomLivre) && !livre.isEtat()) {
                livre.setEtat(true);
                _membreActuel.retourner(livre);
                livreTrouve = true;
                break; // Sort de la boucle une fois que le livre a été retourné
            }
        }

        if (!livreTrouve) {
            System.out.println("Ce livre n'existe pas ou n'est pas disponible!");
        }
    }

    @Override
    public void afficher() {
        if (_livres.isEmpty()) {
            System.out.println("Aucun livre disponible!");
            return;
        }

        System.out.println("\nLes livres disponibles : ");
        int numberLivre = 0;

        for (Livre livre : _livres) {
            numberLivre++;
            System.out.println("\nLivre n°" + numberLivre + ". " + livre);
        }
    }

    public void livresEmpruntes() { 
        _membreActuel.livresEmpruntes();
    }
}
