import java.util.ArrayList;

/**
 * Cette classe ne comprend que des methodes
 * certaines sont des algorithme
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

    /***
     * si victory number > defeat number, capacite +=1+ (int) (victory number - defeat number)/coefv(10)
     * si victory number < defeat number, capacite +=1+ (int) abs(victory number - defeat number)/coefd(20)
     * @param nbVictoire
     * @param nbDefaite
     * @return la difference de capacite a ajouter a la capacite originale
    */
    public static int capaciteDifference(int nbVictoire, int nbDefaite) {
        if(nbVictoire > nbDefaite){
            return 1 + (int) ((nbVictoire - nbDefaite)/10);
        }else{
            return 1 + (int) ((nbDefaite - nbVictoire)/20);
        }
    }

    /***
     * 
     * @param remplacants
     * @return remplacant le plus capable (une instance)
    */
    public static Remplacant remplacantLePlusCapable(ArrayList<Remplacant> remplacants) {
        if(remplacants.size() == 0){
            return null;
        }
        Remplacant capmax = remplacants.get(0);
        for(Remplacant r : remplacants){
            if (capmax.capacite < r.capacite) {
                capmax = r;
            }
        }
        return capmax;
    }

    /***
     * 
     * @param joueurs
     * @return joueur le plus capable (une instance)
    */
    public static Joueur joueurLePlusCapable(ArrayList<Joueur> joueurs) {
        if(joueurs.size() == 0){
            return null;
        }
        Joueur capmax = joueurs.get(0);
        for(Joueur j : joueurs){
            if (capmax.capacite < j.capacite) {
                capmax = j;
            }
        }
        return capmax;
    }

}
