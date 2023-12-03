# Projet de Gestion de Bibliothèque en Java

## Description

Ce projet est une application de gestion de bibliothèque développée en Java en utilisant les concepts de la programmation orientée objet (OOP), notamment les interfaces, l'héritage, les classes abstraites et les packages.

## Fonctionnalités

1. **Livres :**

   - La classe `Livre` représente un livre avec des détails tels que le titre, l'auteur, l'année de publication, etc.
   - La classe utilise l'interface `Empruntable` pour marquer les livres qui peuvent être empruntés.
   - La classe abstraite `MaterielBibliothecaire` gère les propriétés communes des objets dans la bibliothèque.

2. **Membres :**

   - La classe `Membre` représente les membres de la bibliothèque.
   - L'interface `Emprunteur` est utilisée pour marquer les membres qui peuvent emprunter des livres.

3. **Transactions :**

   - La classe `Transaction` représente les emprunts et les retours de livres.
   - Les méthodes de la classe gèrent les détails de chaque transaction.

4. **Gestion de la Bibliothèque :**
   - La classe `Bibliotheque` gère la liste des livres disponibles, des membres et des transactions.
   - Les classes sont organisées en packages logiques tels que `bibliotheque.livre`, `bibliotheque.membre`, `bibliotheque.transaction`.

## Utilisation

1. **Initialisation :**

   - Créez une instance de la classe `Bibliotheque`.
   - Ajoutez des livres à la bibliothèque et enregistrez des membres.

2. **Emprunt et Retour :**

   - Les membres peuvent se connecter, rechercher des livres et emprunter ceux disponibles.
   - Les retours de livres mettent à jour la disponibilité dans la bibliothèque.

3. **Transactions :**

   - Chaque transaction est enregistrée avec des détails sur le livre, le membre et la date.

4. **Affichage des Informations :**
   - La bibliothèque peut afficher les livres disponibles, les membres, les transactions récentes, etc.

<<<<<<< HEAD
## Auteur

### [Atlas]
=======
## Mon Problèmme

1. **L'interface**

   - L'interface Empruntable j'arriva pas à implimenter l'interface dans la class `Biliotheque` ce qui cause une erreur et ça me soule

   ```PowerShell
    Entrez le nom du livre à emprunter : Exception in thread "main" java.lang.UnsupportedOperationException: Méthode 'emprunter' non implémentée
     at fr.atlas.Bibliotheque.emprunter(Bibliotheque.java:103)
     at fr.atlas.Bibliotheque.connecterUnMenbre(Bibliotheque.java:80)
     at App.main(App.java:28)
   ```

2. **Problème de code / mauvaise gestions des types de données**

   - Après avoir créer un livre des que je décide de créer un compte ça saute un bout de mon code ou il faut ajouter le nom de l'utilisateur

   ```PowerShell
   Bienvenue dans la bibliotheque de Atlas que voulez vous faire !

      1. Créer un compte :
      2. Se conecter :
      3. Ajouter un livre :
      4. Quitter :

      Entrez votre choix : 3

      Entrez le titre du livre : test1
      Entrez le nom de l'auteur : test
      Entrez l'état du livre : true
      Entrez l'année de publication : 2023
      Votre livre à été ajouté!

      1. Créer un compte :
      2. Se conecter :
      3. Ajouter un livre :
      4. Quitter :

      Entrez votre choix : 1

      Entrez votre nom d'utilisateur : Entrez votre email :
   ```


## Auteur

[Atlas-00]

---
>>>>>>> dev
