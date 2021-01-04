/**
 * Un remplacant peut devenir un joueur
 * Sa capacite ne sera pas prise en compte
 * et donc obtenir un salaire plus eleve
*/
public class Remplacant extends Joueur{
    
    // attribut

  
    public static double salaireDefaut = 1;
    protected final static double COEFFSALAIRECAPACITEREM = 1.;
    private final static int MINR = 30;//temporaire
    private final static int MAXR = 65;


    //méthode

    public Remplacant(int capacite, int age) {
        super(capacite, age);
        this.salaire = salaireDefaut;
    }

    /**
     * constructeur par copie
     * @param r le remplacant a copier
    */
    public Remplacant(Remplacant r) {
        this.capacite = r.capacite;
        this.salaire = r.salaire;
        this.age = r.age;
        this.contrat = contratDefaut;
    }

    /**
     * constructeur par defaut
    */
    public Remplacant()
    {
        super(Outil.aleatoireIntEntre(MINR, MAXR), Outil.aleatoireIntEntre(ageDefaut, ageDefaut + 3));
        this.salaire = this.capacite * COEFFSALAIRECAPACITEREM;

    }
    

    
    public void sePresenter(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Remplacant [nom=" + nom + ", age=" + age + ", capacite=" + capacite + ", contrat=" + contrat + ", salaire=" + salaire + "]\n";
    }
    

}