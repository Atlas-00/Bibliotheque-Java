package fr.atlas;

public interface Empruntable {

    // Marquer le livre comme emprunté
    void emprunter();

    // Marquer le livre comme retourné
    void retourner();

    // Vérifier si le livre est actuellement emprunté
    boolean estEmprunte();
}
