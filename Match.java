/**
 * le singleton cette classe contient des donnees du match
 */
public final class Match {
    private static Match match;
    public final static double beneficeMatch = 10.;
    private final static int MIN = 55;
    private final static int MAX = 95;
    private final static int NOMBREDEMATCH = 80;
    private int capaciteNotre;
    private int capaciteAdversaire;
    private int nbVictoire;
    private int nbDefaite;
  
    /**
     * creer un match a partir de la capacite de toute l'equipe
     * 
     * @param capaciteNotre
     */
    private Match(int capaciteNotre) {
      this.capaciteNotre = capaciteNotre;
    }
  
    /**
     * calculer le nombre de vitoires et de defaites tourner NOMBREDEMATCH fois
     * capaciteAdversaire est tiree entre MIN et MAX
     */
    public void resultMatch() {
      for (int i = 0; i < NOMBREDEMATCH; i++) {
        capaciteAdversaire = Outil.aleatoireIntEntre(MIN, MAX);
        if (capaciteNotre > capaciteAdversaire) {
          nbVictoire++;
        } else {
          nbDefaite++;
        }
      }
      System.out
          .println("Dans cette competition, l'equipe a gagne " + nbVictoire + " fois, et a perdu " + nbDefaite + "fois.");
    }
  
    public final static Match getMatch() {
      if (match != null) {
        return match;
      } else {
        System.out.println("L'equipe ne s'engage dans aucun match.");
        return null;
      }
    }
  
    public final static Match getMatch(int capaciteNotre) {
      match = new Match(capaciteNotre);
      return match;
    }
  
    /**
     * supprimer le singleton
     */
    public void finirMatch() {
      nbVictoire = 0;
      nbDefaite = 0;
      match = null;
    }
  
    public int getCapaciteNotre() {
      return capaciteNotre;
    }
  
    public void setCapaciteNotre(int capaciteNotre) {
      this.capaciteNotre = capaciteNotre;
    }
  
    public int getCapaciteAdversaire() {
      return capaciteAdversaire;
    }
  
    public void setCapaciteAdversaire(int capaciteAdversaire) {
      this.capaciteAdversaire = capaciteAdversaire;
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
  