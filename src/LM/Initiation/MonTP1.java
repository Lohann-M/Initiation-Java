package LM.Initiation;

import java.util.Scanner;

public class MonTP1 {
    public static void main(String[ ] args)
    {
        // Déclaration de variable
        String msg;
        String nom, prenom;

        // Saisie du nom et du prénom
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez votre nom: ");
        nom = clavier.nextLine();
        System.out.println("Entrez votre prenom: ");
        prenom = clavier.nextLine();

        // conversion en majuscules et minuscules
        nom = nom.toUpperCase();
        prenom = prenom.toLowerCase();

        // Concaténations avec l'opérateur +
        msg = "Bonjour " + prenom + " " + nom + ", et bienvenue sur cette application !";

        // Affichage du résultat
        System.out.println(msg);

        // Fermeture du clavier
        clavier.close();
    }
}