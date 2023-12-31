package fr.atlas;

import java.util.List;

public interface Emprunteur {

    // Méthode pour emprunter un livre
    void emprunter(Livre livre);

    // Méthode pour retourner un livre
    void retourner(Livre livre);

    // Méthode pour récupérer la liste des livres empruntés
    void livresEmpruntes();
}
