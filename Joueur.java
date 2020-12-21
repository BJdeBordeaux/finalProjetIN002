/**
 * Un joueur peut se categorise en attaqueur, defenseur et gardien (héritage)
 * Si non il est un remplacant
 */
public abstract class Joueur extends Personne implements Evaluable{

    // attribut
    protected double capaciteAttaque;
    protected double capaciteDefense;
    protected int age;
    
    
    // méthode

    public Joueur(double capaciteAttaque, double capaciteDefense, int age) // constructeur
    {
        // a finir
    }
    public Joueur(Joueur j) // construction par copie
    {
        // a finir
    }

    public Joueur() // constructeur par défaut utilisant des donnée aleatoire
    {
        // a finir
    }

    public boolean evaluer()
    {
        // a finir
        return true;
    }

    /**
     * augmenter l'age et diminuer capacite
    */
    public void decliner(){

    }
    

    /**
     * grace au coach
    */
    public void augmenterCapacite(Coach c){
        // a finir
    }
    


}
