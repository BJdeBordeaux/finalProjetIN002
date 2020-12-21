import java.util.ArrayList;


public class Club {
    private Manager manager;
    private Coach coach;
    private ArrayList<Joueur> remplacants;
    private ArrayList<Attaqueur> attaqueurs;
    private ArrayList<Defenseur> defenseurs;
    private Gardien gardien;
    private Match match;
    private int somme;
    private double plafondSalaire;
    private double tresorie;

    /**
    * avant la promotion, verifie si  le salaire total est plus grand que le plafondSalaire
    *    Si oui, throw new DepassementBudgetException
    *    sinon, continue
    * catch : on prend Joueur moins compétent
    */
    public boolean budget() throws DepassementPlafondSalaireException{
        // a finir
        return true;
    }
    
    /**
    *créer une instance et l'ajoute dans la liste correspondant
    *    0: coach
    *    1: attaquer
    *    2: defenseur
    *    3: gardien
    *    4: joueur
    */
    public void recrutement(int type){
        // a finir
    }

    /**
    * Remplacer un joueur par un autre 
    *    Enregistrement  dans l'attribut  correspondant du Club 
    */
    public void remplacement(){
        // a finir
    }

    /**
    * trouve un joueur dans le remplacant en le nommant joueur principal
    *    on peut créer des liste temporaire
    */
    public void promotion(){
        // a finir
    }
        
    /**
    * voir si tout le monde (sauf manager) est compétent
    *        non compétent :
    *            joueur, coach : evaluer renvoie false
    *    si oui, on le garde
    *    sinon, on l'envoie
    */
    public void evaluer(){
        // a finir
    }
        
    
    /**
    * renvoie les joueur : age > 30
    *    evaluer
    *    promotion
    *    recrutement des remplacants
    */
    public void mettreAJouer(){
        // a finir
        
    }
        
    
    /**
    *comparer les données du match et la somme de capacite de joueur principaux
    *    si ce nombre du matche est plus petit, on gagner; sinon on perd
    *        gagné : on prend le prime
    *    en tout cas on paie le salaire de tout le monde
    */
    public void participerAuMatch(){
        // a finir
        
    }
        
    public String toString(){
        // a finir
        return "";
    }
}
