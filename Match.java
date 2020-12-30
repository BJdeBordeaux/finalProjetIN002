/**
 * le singleton
 * cette classe contient des donnees du match
*/
public class Match {
    private static Match  match;
    private double capaciteNotre;
    private double captaciteAdversaire;
    private int nbVictoire;
    private int nbDefaite;
    

    /**
     * creer un match a partir de capacite de tout equipe
     * @param capaciteNotre
    */
    private Match(double capaciteNotre){
        Match.match.capaciteNotre = capaciteNotre;
    }

    public final static Match getMatch(){
        if(match != null){
            return match;
        }else{
            System.out.println("L'equipe ne s'engage pas a aucun match.");
            return null;
        }
    }

    public final static Match getMatch(double capaciteNotre){
        match = new Match(capaciteNotre);
        return match;
    }

    public void finirMatch() {
        match = null;
    }


    public double getCapaciteNotre() {
        return capaciteNotre;
    }

    public void setCapaciteNotre(double capaciteNotre) {
        this.capaciteNotre = capaciteNotre;
    }

    public double getCaptaciteAdversaire() {
        return captaciteAdversaire;
    }

    public void setCaptaciteAdversaire(double captaciteAdversaire) {
        this.captaciteAdversaire = captaciteAdversaire;
    }

    public int getNbVictoire() {
        return nbVictoire;
    }

    public void setNbVictoire(int nbVictoire) {
        this.nbVictoire = nbVictoire;
    }

    public int getNbDefaite() {
        return nbDefaite;
    }

    public void setNbDefaite(int nbDefaite) {
        this.nbDefaite = nbDefaite;
    }



}
