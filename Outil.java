/**
 * Cette classe ne comprend que des methodes
 * 
*/
public class Outil {
    
    /**
     * 
     * @param min
     * @param max
     * @return Un double dans [min, max)
    */
    public static double aleatoireDoubleEntre(int min, int max) {
        return Math.random()*(max - min) + min;
    }

    /**
     * 
     * @param min
     * @param max
     * @return un entier entre [min, max]
    */
    public static int aleatoireIntEntre(int min, int max){
        return (int) (Math.random()*(max - min + 1) + min);
    }

    /**
     * tirer une lettre aleatoire
     * pour le nom des personnes
    */
    public static char aleatoireLettre(){
        return (char)((int)(Math.random()*26)+'A');
    }

    /**
     * tirer une chaine de caracteres aleatoire
     * pour le nom des personnes
    */
    public static String aleatoireChaine(){
        String s = "";
        for(int i = 0; i < 3; i++){
            s += aleatoireLettre();
        }
        return s;
    }

    /**
     * tirer n caracteres aleatoire
     * pour le nom des personnes
     * @param n
    */
    public static String aleatoireChaine(int n){
        String s = "";
        for(int i = 0; i < n; i++){
            s += aleatoireLettre();
        }
        return s;
    }

    /**
     * tire un nombre aleatoire entre 0 et 1, si plus grand que seuil, return true
    */
    public static boolean avoirLieuSeuil(double seuil) 
    {
        return (Math.random() < seuil);
    }

}
