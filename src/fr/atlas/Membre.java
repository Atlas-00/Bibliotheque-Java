package fr.atlas;

import java.util.ArrayList;
import java.util.List;

public class Membre implements Emprunteur {

    private String mNomUtilisateur;
    private String mEmail;
    private String mPassword;
    private List<Livre> livresEmpruntes; // Ajout d'une liste pour suivre les livres empruntés

    public Membre(String nomUtilisateur, String email, String password) {
        this.mNomUtilisateur = nomUtilisateur;
        this.mEmail = email;
        this.mPassword = password;
        this.livresEmpruntes = new ArrayList<>(); // Initialisation de la liste des livres empruntés
    }

    public String getmNomUtilisateur() {
        return mNomUtilisateur;
    }

    public String getmPassword() {
        return mPassword;
    }

    @Override
    public void emprunter(Livre livre) {
        livresEmpruntes.add(livre);
        System.out.println("Le livre '" + livre.getNomLivre() + "' a été emprunté par " + mNomUtilisateur);
    }

    @Override
    public void retourner(Livre livre) {
        livresEmpruntes.remove(livre);
        System.out.println("Le livre '" + livre.getNomLivre() + "' a été retourné par " + mNomUtilisateur);
    }

    @Override
    public void livresEmpruntes() {
        System.out.println("\nListe des empruntes :");
        int numberLivreEmpruntes = 0;

        if (livresEmpruntes.isEmpty()) {
            System.out.println("Aucun livre emprunté!");
        }

        for (Livre livres : livresEmpruntes) {
            numberLivreEmpruntes++;
            System.out.println("Emprunt n°" + numberLivreEmpruntes + livres);
        }
    }
}
