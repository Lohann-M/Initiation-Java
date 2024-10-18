package LM.Initiation;

public class MonTP3 {
    public static void main(String[] args) {
        String msg;
        String nom, prenom;

        // Saisie du nom et du prenom
        nom = Outils.saisir("Entrez votre nom :");
        prenom = Outils.saisir("Entrez votre prenom :");

        // Conversion en majuscules et minuscules
        nom = nom.toUpperCase();
        prenom = prenom.toLowerCase();

        // Concaténation avec l'opérateur +
        msg = "Bonjour " + prenom + " " + nom + ", et bienvenue sur cette application !";

        // Affichage du résultat
        Outils.afficher(msg);
    }
}
