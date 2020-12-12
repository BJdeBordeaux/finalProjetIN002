/**
 * Une personne est soit jouer, soit manager, soit coach
 * On definit le salaire quand on etend cette classe
*/
public abstract class Personne {
    protected String nom;
    protected String prenom;
    protected double salaire;

    /**
     * Construit une personne a partir de ces arguments
     * @param nom
     * @param prenom
     * @param salaire
     */
    protected Personne(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    /***
     * Pour simplifier, on ne prend en compte le nom et le prenom
     * @param salaire
    */
    protected Personne(double salaire) {
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
        this.nom = "Sans nom";
        this.prenom = "Sans prenom";
    }

    /**
     * retourne un string indiquant le nom, prenom, et d'autres informations necessaire
    */
    public abstract String toString();


}
