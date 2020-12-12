/**
 * Logiquement un manager assure le bon fonctionnement financier d'un club
 * Ici ce caracter prends de l'argent, et une fois il n'est pas paye, il est parti
 * Une fois il est parti, le programme est termine
*/
public class Manager extends Personne{
    private boolean parti;

    public Manager(double salaire, String nom, String prenom) {
        super(nom, prenom, salaire);
        parti = false;
    }

    /**
     * 
     * @return si le manager est parti
     * si oui, le programme se termine
    */
    public boolean isParti() {
        return parti;
    }

    public void setParti(boolean parti) {
        this.parti = parti;
    }

    @Override
    public String toString() {
        return "Manager " + super.nom + " " + super.prenom + "\n";
    }

    /**
     * Le manager prendre son salaire. S'il n'y a pas une somme suffisant sur le compte, il part
    */
    public void prendSalaire(double somme) {
        if(somme < salaire){
            System.out.println("La somme sur le compte du club n'est pas suffisant!\n" + 
            "Alors le manager part.");
        }else{
            
        }
    }
}
