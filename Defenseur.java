public class Defenseur extends Joueur{
        
    // attribut

    // ici, on modifie le salaire
    // salaire  = capaciteAttaque * tauxDeSalaire
    // a implementer dans le constructeur
    public static int tauxDeSalaire = 1;
    

    // s'il ne dépasse pas, il est incapable
    public static double competenceSeuil = 1;
    
    //méthode
    /***
     * constructeur usuelle
     * @param capaciteAttaque
     * @param capaciteDefense
     * @param age
    */
    Defenseur(double capaciteAttaque, double capaciteDefense, int age) // constructeur
    {
        super(salaireDefaut * tauxDeSalaire, capaciteAttaque, capaciteDefense, age);
    }

    /***
     * constructeur avec salaire specifie
     * @param salaireTotal
     * @param capaciteAttaque
     * @param capaciteDefense
     * @param age
    */
    Defenseur(double salaireTotal, double capaciteAttaque, double capaciteDefense, int age) // constructeur
    {
        super(salaireTotal, capaciteAttaque, capaciteDefense, age);
    }

    /***
     * constructeur par copie
     * @param joueur
    */
    Defenseur(Joueur joueur)
    {
        super(joueur.salaire*tauxDeSalaire, joueur.capaciteAttaque, joueur.capaciteDefense, joueur.age);
    }

    /**
     * constructeur par defaut
    */
    Defenseur()
    {
        // a finir
    }
    

    public void sePresenter() {
        System.out.println(this.toString());
    }

    @Override
    public boolean evaluer() {
        return this.capaciteDefense >= seuilCapaciteDefense;
    }

    @Override
    public String toString() {
        return "Defenseur " + nom + ", " + age + " ans.";
    }
}
