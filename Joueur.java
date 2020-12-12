/**
 * Un joueur peut se categorise en attaqueur,
 */
public abstract class Joueur extends Personne {
    protected int capacite_attaque;
    protected int capacite_defence;
    protected int taux_de_salaire; // varie selon sa capacite
    protected int age;

    public Joueur(String nom, String prenom, double salaire, int capacite_attaque, int capacite_defence, int age) {
        super(nom, prenom, salaire);
        this.capacite_attaque = capacite_attaque;
        this.capacite_defence = capacite_defence;
        this.age = age;
    }

    public Joueur(double salaire, int capacite_attaque, int capacite_defence, int age) {
        super(salaire);
        this.capacite_attaque = capacite_attaque;
        this.capacite_defence = capacite_defence;
        this.age = age;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }
}
