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
        System.out.print("\nEntrez votre nom d'utilisateur :");
        String nomUtilisateur = scanner.nextLine();

        System.out.print("Entrez votre email :");
        String email = scanner.nextLine();

        System.out.print("Entrez votre mot de passe :");
        String password = scanner.nextLine();

        _membres.add(new Membre(nomUtilisateur, email, password));
        System.out.println("Votre compte à été créer !");
    }
}
