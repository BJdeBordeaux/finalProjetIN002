/**
 * Logiquement un manager assure le bon fonctionnement financier d'un club
 * Ici ce caracter prends de l'argent
*/
public class Manager extends Personne{
    
    //    attribut
    
    public static final double salaireDefaut = 1; // plus grand que salaire defaut d'une Personne
    
    //méthode

    public Manager(double salaire) {
        super(salaire);
    }

    public Manager() {
        super(salaireDefaut);
    }



    public void sePresenter()
    {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Manager " + nom;
    }

}