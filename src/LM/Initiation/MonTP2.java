package LM.Initiation;

import com.sun.jdi.event.StepEvent;

import javax.swing.JOptionPane;

public class MonTP2 {
    public static void main(String[] args) {
        // Déclaration des variables
        String msg;
        String nom, prenom;

        // Saisie du nom et du prénom
        msg = "Entrez votre nom";
        nom = JOptionPane.showInputDialog(null, msg, "Saisie", JOptionPane.QUESTION_MESSAGE);
        msg = "Entrez votre prenom";
        prenom = JOptionPane.showInputDialog(null, msg, "Saisie", JOptionPane.QUESTION_MESSAGE);

        // Conversion en majuscules et minuscules
        nom = nom.toUpperCase();
        prenom = prenom.toLowerCase();

        // Concaténation avec l'opérateur +
        msg = "Bonjour " + prenom + " " + nom + ", et bienvenue sur cette application !";

        // Affichage du résultat
        JOptionPane.showMessageDialog(null, msg, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}