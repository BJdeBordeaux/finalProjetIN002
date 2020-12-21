/**
 * Une personne est soit jouer, soit manager, soit coach
 * On definit le salaire quand on etend cette classe
*/
public abstract class Personne {

    // attributs

    protected String nom; // tirer au hazard par Outil.lettreAleatoire() 3 fois
    protected double salaire; //en million
    public static double salaireDefaut = 0;

    // méthode

    protected Personne(double salaire) //Constructeur
    {
        this.nom = Outil.aleatoireChaine();
        this.salaire = salaire;
    }

    protected Personne() //Constructeur par défaut
    {
        this(salaireDefaut);
        this.nom = Outil.aleatoireChaine();
    }

    // méthode abstraite
    
    public abstract void sePresenter();

}
