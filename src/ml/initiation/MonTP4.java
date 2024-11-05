package ml.initiation;

public class MonTP4 {

    // Méthode pour transformer une chaîne en prénom formaté

    public static String transformeEnPrenom(String laChaine) {

        String partie1; // la partie 1 du résultat (Première Majuscule)

        String partie2; // la partie 2 du résultat (minuscules et tiret)

        String partie3; // la partie 3 du résultat (Deuxième majuscule)

        String partie4; // la partie 4 du résultat (minuscules)

        int longueur; // longueur de la chaîne saisie

        int positionTiret; // position du tiret

        laChaine = laChaine.trim(); // supprime les espaces inutiles à gauche et à droite

        longueur = laChaine.length();

        if (longueur < 2) return laChaine.toUpperCase();

        positionTiret = laChaine.indexOf("-");

        if (positionTiret == -1) {

            partie1 = laChaine.substring(0, 1);

            partie2 = laChaine.substring(1);

            return partie1.toUpperCase() + partie2.toLowerCase();

        } else {

            partie1 = laChaine.substring(0, 1);

            partie2 = laChaine.substring(1, positionTiret+1);

            partie3 = laChaine.substring(positionTiret + 1, positionTiret + 2);

            partie4 = laChaine.substring(positionTiret + 2);

            return partie1.toUpperCase() + partie2.toLowerCase() + partie3.toUpperCase() + partie4.toLowerCase();

        }

    }
}


