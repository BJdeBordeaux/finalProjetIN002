public class Coach extends Personne{

    //attribut

    // des valeurs par défaut
    public static final double salaireDefaut = 1;

    // valeurs pour une instance
    private double capacite;

    protected int addTeamCapacite = (int)(capacite / 40);

    //methode


    /***
     * constructeur a partir de salaire et la capacite
     * @param salaire
     * @param capacite
    */
    public Coach(double salaire, double capacite) // Constructeur
    {
        super(salaire);
        this.capacite = capacite;
    }

    /**
     * constructeur a partir de capacite, salaire = salaireDefaut
     * @param capacite
    */
    public Coach(double capacite) // Constructeur
    {
        super(salaireDefaut);
        this.capacite = capacite;
    }

    /**
     * constructeur par défaut
    */
    public Coach() 
    {
      this(Outil.aleatoireIntEntre(50,60));
    }
    
    /**
     * afficher des information pour l'utilisateur
    */
    public void sePresenter() 
    {
        System.out.println(this.toString());
    }
    
    public void setCoachCapaciteMatch(int nbvictoire, int nbdefaite){
      if(nbvictoire > nbdefaite){
        this.capacite += (nbvictoire - nbdefaite)/10;
      }
      else{
        this.capacite-= (nbdefaite - nbvictoire) / 10;
      }
    }

    //getters and setters

	@Override
    public String toString() {
        return "Coach [nom=" + nom + ", capacite=" + capacite + ", salaire=" + salaire + "]\n";
    }
    
    public static double getSalairedefaut() {
        return salaireDefaut;
    }

    public double getCapacite() {
        return capacite;
    }

    public void setCapacite(double capacite) {
        this.capacite = capacite;
    }
}
