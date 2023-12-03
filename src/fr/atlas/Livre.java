package fr.atlas;

public class Livre{

    public String mTitre;
    public String mAuteur;
    public boolean mEtat;
    public int mAnnee;

    public Livre(String titre, String auteur, boolean etat, int annee) {
        this.mTitre = titre;
        this.mAuteur = auteur;
        this.mEtat = etat;
        this.mAnnee = annee;
    }

    public String getNomLivre() {
        return mTitre;
    }

    public boolean isEtat() {
        return mEtat;
    }

    public void setEtat(boolean nouvelleEtat) {
        this.mEtat = nouvelleEtat;
    }

    @Override
    public String toString() {
        return "\nNom : " + mTitre + ", Auteur : " + mAuteur + ", Etat" + (mEtat ? " 'emprunter'" : " 'disponible'")
                + ", Année de publications : " + mAnnee;
    }
}
