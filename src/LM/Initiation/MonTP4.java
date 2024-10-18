package LM.Initiation;

public void main() {
    TransformeEnPrenom();
}

// méthode partagée (ou méthode de classe) pour remettre en forme les prénoms
        public static String TransformeEnPrenom()
{ String partie1; // la partie 1 du résultat (Première Majuscule)
    String partie2; // la partie 2 du résultat (minuscules et tiret)
    String partie3; // la partie 3 du résultat (Deuxième majuscule)
    String partie4; // la partie 4 du résultat (minuscules)
    int longueur; // longueur de la chaîne saisie
    int positionTiret; // position du tiret
    laChaine = laChaine.Trim(); // supprime les espaces inutiles à gauche et à droite
    longueur = laChaine.Length;
    if (longueur < 2) return laChaine.ToUpper();
    positionTiret = laChaine.IndexOf("-");
    if (positionTiret == -1)
    { partie1 = laChaine.Substring(0, 1);
        partie2 = laChaine.Substring(1, longueur - 1);
        return partie1.ToUpper() + partie2.ToLower();
    }
    else
    { partie1 = laChaine.Substring(0, 1);
        partie2 = laChaine.Substring(1, positionTiret);
        partie3 = laChaine.Substring(positionTiret + 1, 1);
        partie4 = laChaine.Substring(positionTiret + 2, longueur - positionTiret - 2);
        return partie1.ToUpper() + partie2.ToLower() + partie3.ToUpper() + partie4.ToLower();
    }
}
