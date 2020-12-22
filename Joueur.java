/**
 * Un joueur peut se categorise en attaqueur, defenseur et gardien (héritage) Si
 * non il est un remplacant
 */
public abstract class Joueur extends Personne implements Evaluable {

    // attribut
    protected static int seuilAge = 1; // si un joueur depasse cet age, il se decline
    protected static int seuilCapaciteAttaque = 1; // si la capacite est moins que ce seuil, un joueur sera elimine
    protected static int seuilCapaciteDefense = 1;
    protected static int capaciteDeclin = 1; // la capacite qu'un joueur perd si son age depasse le seuil
    protected static int salaireDefaut = 1;
    protected double capaciteAttaque;
    protected double capaciteDefense;
    protected int age;

    // méthode

    public Joueur(double salaire, double capaciteAttaque, double capaciteDefense, int age) // constructeur
    {
        super(salaire);
        this.capaciteAttaque = capaciteAttaque;
        this.capaciteDefense = capaciteDefense;
        this.age = age;
    }

    public Joueur(double capaciteAttaque, double capaciteDefense, int age) // constructeur
    {
        super(salaireDefaut);
        this.capaciteAttaque = capaciteAttaque;
        this.capaciteDefense = capaciteDefense;
        this.age = age;
    }

    public Joueur() // constructeur par défaut utilisant des donnée aleatoire
    {
        // a finir
    }

    /**
     * construction par copie
     */
    public Joueur(Joueur j) {
        super(j.salaire);
        this.capaciteAttaque = j.capaciteAttaque;
        this.capaciteDefense = j.capaciteDefense;
        this.age = j.age;
    }

    public boolean evaluer() {
        if (capaciteAttaque < seuilCapaciteAttaque) {
            return false;
        } else if (capaciteDefense < seuilCapaciteDefense) {
            return false;
        }
        return true;
    }

    /**
     * augmenter l'age et diminuer capacite
     */
    public void decliner() {
        age += 1;
        if (age >= seuilAge) {
            capaciteAttaque -= capaciteDeclin;
            capaciteDefense -= capaciteDeclin;
        }
    }

    /**
     * grace au coach
     */
    public void augmenterCapacite(Coach c) {
        this.capaciteAttaque += c.getAugmenterAttaque();
        this.capaciteDefense += c.getAugmenterDefense();
    }

    @Override
    public void sePresenter() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Joueur " + nom + ", " + age + " ans.";
    }
    


}
