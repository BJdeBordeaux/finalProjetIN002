/**
 * Logiquement un manager assure le bon fonctionnement financier d'un club
 * Ici on le manager represente tout le groupe logistique
*/
public class Manager extends Personne{
    
    //    attribut
    
    public static final double salaireDefaut = 1; // plus grand que salaire defaut d'une Personne
    protected static double addBenefice = salaireDefaut*1. ; 
    
    //méthode
    /***
     * constructeur avec salaire specife
     * @param salaire
    */
    public Manager(double salaire) {
        super(salaire);

    }

    /**
     * constructeur par defaut
    */
    public Manager() {
        super(salaireDefaut);
    }

    /**
     * constructeur par copie
    */
    public Manager(Manager m) {
        super(m.salaire);
    }

    /**
     * afficher des information pour l'utilisateur
    */
    public void sePresenter()
    {
        System.out.println(this.toString());
    }
    
    @Override
    public String toString() {
        return "Manager [nom=" + nom + ", salaire=" + salaire + "]\n";
    }

}