public class Coach extends Personne{

    //attribut

    public static final double augmenterAttaqueDefaut = 1;
    public static final double augmenterDefenseDefaut = 1;
    public static final double  capaciteDeclinDefaut = 1; // des valeurs par défaut
    private double augmenterAttaque;
    private double augmenterDefense;
    private double capaciteDeclin;

    //methode

    public Coach(double augmenterAttaque, double augmenterDefense, double capaciteDeclin) // Constructeur
    {
        // a finir
    }

    public Coach() //constructeur par défaut
    {
        // a finir
    }

    public void declin(){
        // a finir
    }

    public boolean evaluer()
    {
        // a finir
        return true;
    }
    
    public void decliner()
    {
        // a finir
    }

    public void sePresenter() 
    {
        // a finir 
    }

    //getters and setters

    public double getAugmenterAttaque() {
        return augmenterAttaque;
    }

    public void setAugmenterAttaque(double augmenterAttaque) {
        this.augmenterAttaque = augmenterAttaque;
    }

    public double getAugmenterDefense() {
        return augmenterDefense;
    }

    public void setAugmenterDefense(double augmenterDefense) {
        this.augmenterDefense = augmenterDefense;
    }

    public double getCapaciteDeclin() {
        return capaciteDeclin;
    }

    public void setCapaciteDeclin(double capaciteDeclin) {
        this.capaciteDeclin = capaciteDeclin;
    }
    
}
