package ml.initiation;

public class MonTP4 {
    public MonTP4() {
    }

    public static String TransformeEnPrenom(String laChaine) {
        laChaine = laChaine.trim();
        int longueur = laChaine.length();
        if (longueur < 2) {
            return laChaine.toUpperCase();
        } else {
            int positionTiret = laChaine.indexOf(45);
            String var10000;
            String partie1;
            String partie2;
            if (positionTiret == -1) {
                partie1 = laChaine.substring(0, 1);
                partie2 = laChaine.substring(1, longueur);
                var10000 = partie1.toUpperCase();
                return var10000 + partie2.toLowerCase();
            } else {
                partie1 = laChaine.substring(0, 1);
                partie2 = laChaine.substring(1, positionTiret);
                String partie3 = laChaine.substring(positionTiret + 1, positionTiret + 2);
                String partie4 = laChaine.substring(positionTiret + 2, longueur);
                var10000 = partie1.toUpperCase();
                return var10000 + partie2.toLowerCase() + partie3.toUpperCase() + partie4.toLowerCase();
            }
        }
    }

    public static void main(String[] args) {
        String test1 = TransformeEnPrenom("jean-luc");
        String test2 = TransformeEnPrenom("MARIE");
        String test3 = TransformeEnPrenom("luc");
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
    }
}


