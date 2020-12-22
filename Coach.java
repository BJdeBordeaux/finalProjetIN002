public class Coach extends Personne{

    //attribut

    // des valeurs par défaut
    public static final double augmenterAttaqueDefaut = 1;
    public static final double augmenterDefenseDefaut = 1;
    public static final double capaciteDeclinDefaut = 1;
    public static final double salaireDefaut = 1;
    
    private double augmenterAttaque;
    private double augmenterDefense;
    private double capaciteDeclin;

    //methode

    public Coach(double salaire, double augmenterAttaque, double augmenterDefense, double capaciteDeclin) // Constructeur
    {
        super(salaire);
        this.augmenterAttaque = augmenterAttaque;
        this.augmenterDefense = augmenterDefense;
        this.capaciteDeclin = capaciteDeclin;
    }

    public Coach(double augmenterAttaque, double augmenterDefense, double capaciteDeclin) // Constructeur
    {
        super(salaireDefaut);
        this.augmenterAttaque = augmenterAttaque;
        this.augmenterDefense = augmenterDefense;
        this.capaciteDeclin = capaciteDeclin;
    }

    public Coach() //constructeur par défaut
    {
        super();
        // a finir
    }

    public boolean evaluer()
    {
        if (this.augmenterAttaque < 0) {
            return false;
        }else if(this.augmenterDefense < 0){
            return false;
        }
        return true;
    }
    
    public void decliner()
    {
        this.augmenterAttaque -= this.capaciteDeclin;
        this.augmenterDefense -= this.capaciteDeclin;
    }

    public void sePresenter() 
    {
        System.out.println(this.toString());
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

	@Override
	public String toString() {
		return "Coach " + nom;
	}
    
}
