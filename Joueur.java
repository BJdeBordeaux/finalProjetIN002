/**
 * Un joueur est ce qui participe au match
 */
public class Joueur extends Personne implements Declinable {

    // attribut
    protected static int seuilAge = 32; // si un joueur depasse cet age, il se decline
    protected static int capaciteDeclin = 3; // la capacite qu'un joueur perd si son age depasse le seuil
    protected static int contratDefaut = 4; // la duree de contrat
    
    
    protected static int ageDefaut = 19;
    protected final static double COEFFSALAIRECAPACITE = 1.5;// si un joueur est cree a partir d'un remplacant, salaire = capacite*COEFFSALAIRECAPACITE



    protected int capacite;
    protected int age;
    protected int contrat;
    private final static int MIN = 60;
    private final static int MAX = 95;

    // méthode

    /**
    * constructeur a partir de capacite et age
    */
    public Joueur(int capacite, int age) {
        super(capacite *COEFFSALAIRECAPACITE );
        this.capacite = capacite;
        this.age = age;
        this.contrat = contratDefaut;
        
    }

    /**
    * constructeur par défaut utilisant des donnée aleatoire
    */
    public Joueur() 
    {
        this(Outil.aleatoireIntEntre(MIN, MAX), ageDefaut);
        this.contrat = contratDefaut;
    }

    /**
     * constructeur a partir d'un remplacant
     */
    public Joueur(Remplacant r) {
        super(r.salaire*COEFFSALAIRECAPACITE, r.nom);
        this.capacite = r.capacite;
        this.age = r.age;
        this.contrat = contratDefaut;
        
    }
    
    /**
     * construction par copie
     */
    public Joueur(Joueur j) {
        super(j.salaire);
        this.capacite = j.capacite;
        this.age = j.age;
        this.contrat = contratDefaut;
    }

    /**
     * augmenter l'age et diminuer capacite
     */
    public void decliner() {
        age += 1;
        contrat -= 1;
        if (age >= seuilAge) {
            capacite -= capaciteDeclin;
        }
    }

    /**
     * augmenter la capacite grace au coach
     */
    public void augmenterCapacite(Coach c) {
        this.capacite += c.getCapacite();
    }

    /**
     * afficher des information pour l'utilisateur
    */
    @Override
    public void sePresenter() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Joueur [nom=" + nom + ", age=" + age + ", capacite=" + capacite + ", contrat=" + contrat + ", salaire=" + salaire + "]\n";
    }

    // getters and setters
    
    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
        if(capacite >= 100){
            capacite = 100;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getContrat() {
        return contrat;
    }

    public void setContrat(int contrat) {
        this.contrat = contrat;
    }

    public static int getSeuilAge() {
        return seuilAge;
    }

    public static void setSeuilAge(int seuilAge) {
        Joueur.seuilAge = seuilAge;
    }

    public static int getContratDefaut() {
        return contratDefaut;
    }

    public static void setContratDefaut(int contratDefaut) {
        Joueur.contratDefaut = contratDefaut;
    }

    public static int getAgeDefaut() {
        return ageDefaut;
    }

    public static void setAgeDefaut(int ageDefaut) {
        Joueur.ageDefaut = ageDefaut;
    }

    public boolean equals(Joueur joueurCmp){ 
      if(this.capacite != joueurCmp.capacite || this.age != joueurCmp.age || this.contrat != joueurCmp.contrat)
        return false;
      return true;
    }

    public Joueur clone(){
      return new Joueur(this);
    }
}
