/**
 * le singleton
 * cette classe contient des donnees du match
*/
public class Match {
    private static Match  match;
    private double prime; // en milion, l'argent que le club peut gagner
    private double capacite_attaque;
    private double capacite_defense;

    /**
     * @param p le prime
     * @param ca capacite_attaque
     * @param cd capacite_defense 
    */
    private Match(double p, double ca, double cd){
        Match.match.prime = p;
        Match.match.capacite_attaque = ca;
        Match.match.capacite_defense = cd;
    }
    
    private Match(){
        // a finir
        // construction par defaut ou des chiffres aleatoires
    }

    public final static Match getMatch(){
        if(match != null){
            return match;
        }else{
            match = new Match();
            return match;
        }
    }

    public final static Match getMatch(double p, double ca, double cd){
        if(match != null){
            return match;
        }else{
            match = new Match(p, ca, cd);
            return match;
        }
    }

    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    public double getCapacite_attaque() {
        return capacite_attaque;
    }

    public void setCapacite_attaque(double capacite_attaque) {
        this.capacite_attaque = capacite_attaque;
    }

    public double getCapacite_defense() {
        return capacite_defense;
    }

    public void setCapacite_defense(double capacite_defense) {
        this.capacite_defense = capacite_defense;
    }

}
