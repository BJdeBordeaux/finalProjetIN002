public class Attaqueur extends Joueur{
    
    // attribut

    // ici, on modifie le salaire
    // salaire  = capaciteAttaque * tauxDeSalaire
    // a implementer dans le constructeur
    public static int tauxDeSalaire = 1;
    

    // s'il ne dépasse pas, il est incapable
    public static double competenceSeuil = 1;

    //méthode

    /***
     * constructeur avec salaire specifie
     * @param salaireTotal
     * @param capaciteAttaque
     * @param capaciteDefense
     * @param age
    */
    Attaqueur(double salaireTotal, double capaciteAttaque, double capaciteDefense, int age) // constructeur
    {
        super(salaireTotal, capaciteAttaque, capaciteDefense, age);
    }

    /***
     * 
     * @param capaciteAttaque
     * @param capaciteDefense
     * @param age
    */
    Attaqueur(double capaciteAttaque, double capaciteDefense, int age) 
    {
        super(salaireDefaut*tauxDeSalaire, capaciteAttaque, capaciteDefense, age);
    }
    
    /***
     * constructeur par copie
     * @param joueur
    */
    Attaqueur(Joueur joueur)
    {
        super(joueur.salaire*tauxDeSalaire, joueur.capaciteAttaque, joueur.capaciteDefense, joueur.age);
    }

    /**
     * constructeur par defaut
    */
    Attaqueur()
    {
        // a finir
    }
    

    
    public void sePresenter(){
        System.out.println(this.toString());
    }

    @Override
    public boolean evaluer() {
        return this.capaciteAttaque >= seuilCapaciteAttaque;
    }

    @Override
    public String toString() {
        return "Attaqueur " + nom + ", " + age + " ans.";
    }

}
