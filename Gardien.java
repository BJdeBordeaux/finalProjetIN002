public class Gardien extends Joueur {

    // attribut

    // ici, on modifie le salaire
    // salaire = capaciteAttaque * tauxDeSalaire
    // a implementer dans le constructeur
    public static int tauxDeSalaire = 1;

    public static double seuilCapaciteDefense = 1;

    // s'il ne dépasse pas, il est incapable
    public static double competenceSeuil = 1;

    // méthode
    Gardien(double capaciteAttaque, double capaciteDefense, int age) // constructeur
    {
        super(salaireDefaut * tauxDeSalaire, capaciteAttaque, capaciteDefense, age);
    }

    // constructeur par défaut et par copie a finir

    public void sePresenter() {
        System.out.println(this.toString());
    }

    @Override
    public boolean evaluer() {
        return this.capaciteDefense >= seuilCapaciteDefense;
    }

    @Override
    public String toString() {
        return "Gardien " + nom + ", " + age + " ans.";
    }

    

}
