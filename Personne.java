/**
 * Une personne est soit jouer, soit manager, soit coach
 * On definit le salaire quand on etend cette classe
*/
public abstract class Personne {

    // attributs

    protected String nom; // tirer au hazard par Outil.lettreAleatoire() 3 fois
    protected double salaire; //en million
    public static double salaireDefaut = 1;

    // méthode

    /***
     * constructeur usuel avec salaire specifie
     * @param salaire
    */
    protected Personne(double salaire) //Constructeur
    {
        this.nom = Outil.aleatoireChaine();
        this.salaire = salaire;
    }

    /***
     * constructeur usuel avec salaire et nom specifie
     * @param salaire
     * @param nom
    */
    protected Personne(double salaire, String nom) 
    {
        this.nom = nom;
        this.salaire = salaire;
    }

    /**
     * constructeur par defaut
     * salaire = salaireDefaut
    */
    protected Personne() 
    {
        this(salaireDefaut);
        this.nom = Outil.aleatoireChaine();
    }

    // getters and setters 

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    // méthode abstraite
    
    /**
     * afficher des information pour l'utilisateur
    */
    public abstract void sePresenter();

}
