package ml.initiation;

public class MonTP4 {

    // Méthode statique pour reformater les prénoms
    public static String transformeEnPrenom(String laChaine) {
        String partie1; // première lettre en majuscule
        String partie2; // lettres en minuscules jusqu'au tiret ou fin de mot
        String partie3; // lettre suivant le tiret en majuscule (si présente)
        String partie4; // lettres en minuscules après le tiret
        int longueur;   // longueur de la chaîne
        int positionTiret; // position du tiret

        // Supprime les espaces en début et en fin
        laChaine = laChaine.trim();
        longueur = laChaine.length();

        // Si la chaîne est courte, retourne-la en majuscules
        if (longueur < 2) return laChaine.toUpperCase();

        // Trouve la position du tiret
        positionTiret = laChaine.indexOf("-");

        if (positionTiret == -1) {
            // Pas de tiret, retourne avec première lettre en majuscule, le reste en minuscules
            partie1 = laChaine.substring(0, 1);
            partie2 = laChaine.substring(1, longueur);
            return partie1.toUpperCase() + partie2.toLowerCase();
        } else {
            // Tiret présent, reformate chaque partie
            partie1 = laChaine.substring(0, 1);
            partie2 = laChaine.substring(1, positionTiret);
            partie3 = laChaine.substring(positionTiret + 1, positionTiret + 2);
            partie4 = laChaine.substring(positionTiret + 2, longueur);
            return partie1.toUpperCase() + partie2.toLowerCase() + "-" +
                    partie3.toUpperCase() + partie4.toLowerCase();
        }
    }

    public static void main(String[] args) {
        // Exemple d'utilisation
        System.out.println(transformeEnPrenom("jEAN-MARC"));
        System.out.println(transformeEnPrenom("marie"));
        System.out.println(transformeEnPrenom("MARIE-HELENE"));
    }
}