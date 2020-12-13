/**
 * Un joueur peut se categorise en attaqueur, defenseur et gardien (héritage)
 * Si non il est un remplacant
 */
public abstract class Joueur extends Personne {
    protected int capacite_attaque;
    protected int capacite_defense;
    protected int taux_de_salaire; // varie selon sa capacite
    protected int age;

}