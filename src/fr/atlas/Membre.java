package fr.atlas;

public class Membre {

    public String mNomUtilisateur;
    public String mEmail;
    public String mPassword;
  
    public Membre(String nomUtilisateur, String email, String password) {
        this.mNomUtilisateur = nomUtilisateur;
        this.mEmail = email;
        this.mPassword = password;
    }

    public String getmNomUtilisateur() {
        return mNomUtilisateur;
    }

    public String getmPassword() {
        return mPassword;
    }
}
