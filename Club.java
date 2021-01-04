import java.util.ArrayList;

/**
 * un Club est une unite qui regroupe tous les elements
 * il gere le personnel, prepare au match et ses elements changent selon le resultat
*/
public class Club {
    private Manager manager;
    private Coach coach;
    private ArrayList<Joueur> joueurs;
    private ArrayList<Remplacant> remplacants;
    private Match match;
    

    private static int annee = 0;

    // des valeurs par defaut
    private static int nombreJoueurMax = 11;
    private static int nombreRemplacantMax = 7;
    private static double plafondSalaire = 1000;
    private static int anneeMax = 15; // le nombre max d'annee pour evoluer
    private static double benefice; 

    /**
     * constructeur avec des param specifiees
     * @param manager
     * @param coach
     * @param joueurs
     * @param remplacants
     * @param match
    */
    public Club(Manager manager, Coach coach, ArrayList<Joueur> joueurs, ArrayList<Remplacant> remplacants,
        Match match) {
      this.manager = manager;
      this.coach = coach;
      this.joueurs = joueurs;
      this.remplacants = remplacants;
      this.match = match;
    }

    /**
     * constructeur par defaut
    */
    public Club(){
        this.manager = new Manager();
        this.coach = new Coach();
        this.joueurs = new ArrayList<Joueur>();
        this.remplacants = new ArrayList<Remplacant>();
        this.match = Match.getMatch(0);
    }


    /**
     * renvoyer les Joueurs et Remplacants de plus de 35 ans en les supprimant
    */
    public void renvoyer() {
        for(int i = 0; i < joueurs.size(); i++){
          Joueur j = joueurs.get(i);
          if(j.getAge() >= 38){
            joueurs.remove(j);
            System.out.println(j + " est renvoye");
            i -= 1;
          }
        }
        for(int i = 0; i < remplacants.size(); i++){
          Remplacant r = remplacants.get(i);
          if(r.getAge() >= 34){
            remplacants.remove(r);
            System.out.println(r + " est renvoye");
            i -= 1;
          }
        }
    }

    /***
    * avant la promotion, verifie si  le salaire total est plus grand que le plafondSalaire
    *    Si oui, throw new DepassementBudgetException
    *    sinon, continue
    * @return
    * @throws DepassementPlafondSalaireException
    */
    public boolean budget() throws DepassementPlafondSalaireException{
        // a finir
        double sumsalaire = manager.salaire + coach.salaire; 
        for(Joueur j : joueurs){
          sumsalaire += j.salaire;
        }
        for(Remplacant r : remplacants)
        {
          sumsalaire += r.salaire;
        }
        if(remplacants.size() == 0){
          recrutement();
        }
        sumsalaire += new Joueur(Outil.remplacantLePlusCapable(remplacants)).getSalaire();
        if(sumsalaire <= plafondSalaire){
            return true;
        }else{
            throw new DepassementPlafondSalaireException("Le salaire depasse le plafond.");
        }
    }


    /**
     * enlever Le joueur le plus capable de la ArrayList<Joueur>
     * pour diminuer le salaire total
    */
    public void enleverJoueurLePlusCapable(){
      Joueur capmax = Outil.joueurLePlusCapable(joueurs);
      System.out.println("le joueur : " + capmax.nom+ " de capacite : " + capmax.capacite + "est enlevee");
      joueurs.remove(capmax);
    }

    /**
     * renouveler le contrat pour toute l'equipe
    */
    public void renouvelerContrat() {
      for (Joueur joueur : joueurs) {
        if(joueur.getContrat() == 0)
        joueur.setContrat(Joueur.getContratDefaut());
      }
      for (Remplacant remplacant : remplacants) {
        if(remplacant.getContrat() == 0)
            remplacant.setContrat(Remplacant.getContratDefaut());
      }
    }



    /**
    * trouve un joueur dans la liste de remplacants en le nommant joueur principal
    *    on peut créer des listes temporaires
    */
    public void promotion(){
        if(remplacants.size() == 0){
          recrutement();
        }
        Remplacant capmax = remplacants.get(0);
        for(Remplacant r : remplacants){
            if (capmax.capacite < r.capacite) {
                capmax = r;
            }
        }
        joueurs.add(new Joueur(capmax));
        System.out.println(capmax + " obtient une promotion.");
        remplacants.remove(capmax);
    }

    /**
     * faire decliner tous les joueurs et remplacants
     * incrementation d'age et eventuellement diminer la capacite
    */
    public void decliner() {
      for (Joueur joueur : joueurs) {
        joueur.decliner();
      }
      for (Remplacant remplacant : remplacants) {
        remplacant.decliner();
      }
    }

    /***
     *completer la liste de remplacants
    */
    public void recrutement(){
        while(remplacants.size() < nombreRemplacantMax){
          remplacants.add(new Remplacant()); //ajouter le joueur recruté
        }
    }
   
    /**
    * renvoie les joueur : age > 30
    *    promotion
    *    renouveler les contrats
    *    recrutement des remplacants
    */
    public void mettreAJour(){
        decliner();
        renvoyer();
        renouvelerContrat();
        while(joueurs.size() < nombreJoueurMax){
            try {
              if (budget()) {
                  promotion();
              }
          } catch (DepassementPlafondSalaireException e) {
              System.out.println(e.getMessage());
              enleverJoueurLePlusCapable();
              promotion();
          }
        }
        recrutement();
    }
        
    
    /**
     * simulation d'un concours de football
     * comparer les données du match et la somme de capacite de joueur principaux
     * et changer la capacite des joueurs principaux selon l'algorithme ecrit dans Outil.java
     */
    public void participerAuMatch(){
        this.match = Match.getMatch(getCapaciteNotre());
        match.resultMatch();
        int nbVictoire = match.getNbVictoire();
        int nbDefaite = match.getNbDefaite();
        benefice = (Match.beneficeMatch * Manager.addBenefice)*nbVictoire;
        coach.setCoachCapaciteMatch(nbVictoire,nbDefaite);
        for (Joueur joueur : joueurs) {
          int capaciteOriginal = joueur.getCapacite();
          joueur.setCapacite(coach.addTeamCapacite+capaciteOriginal + Outil.capaciteDifference(nbVictoire, nbDefaite));
        }
        match.finirMatch();
        annee += 1;
    }
    
    /**
     * afficher des information pour l'utilisateur
    */
    public void sePresenter() {
        System.out.println(this.toString());
    }
    /**
     * afficher des information pour l'utilisateur
     * version2
    */
    public void sePresenter2() {
      System.out.println("**********");
      System.out.println("**********");
      System.out.println("Club de football en fin d'annee " + annee + ".");
      manager.sePresenter();
      coach.sePresenter();
      for (Joueur joueur : joueurs) {
        joueur.sePresenter();
      }
      for (Remplacant remplacant : remplacants) {
        remplacant.sePresenter();
      }
      System.out.println("capacite moyen=" + getCapaciteNotre() + "\n");
      System.out.println("benefice du club=" + benefice + "\n");
      System.out.println("**********");
      System.out.println("**********");
    }

    /***
     * Obtenir la capacite de tous les joueurs principaux
     * @return capaciteNotre
    */
    public int getCapaciteNotre(){
      if(joueurs.size() == 0){
          return 0;
      }
      int capaciteNotre = 0;
      for (Joueur joueur : joueurs) {
        capaciteNotre += joueur.getCapacite();
      }
      return capaciteNotre/joueurs.size();
    }

    @Override
    public String toString() {
        String str = "**********\n";
        str += "**********\n";
        str += "Club de football\n";
        str += "annee " + annee + "\n";
        str += manager.toString() + "\n";
        str += coach.toString() + "\n";
        for (Joueur joueur : joueurs) {
            str += joueur.toString();
        }
        for (Remplacant remplacant : remplacants) {
            str += remplacant.toString();
        }
        str += "capacite moyen " + getCapaciteNotre() + "\n";
        str += "**********\n";
        str += "**********\n";
        return str;
    }

    /**
     * completer les attributs manquants du Club
    */
    public void init() {
      
      if(manager == null){
        manager = new Manager();
      }

      if(coach == null){
        coach = new Coach();
      }

      recrutement();
      while(joueurs.size() < nombreJoueurMax){
        promotion();
      }
      recrutement();
      
      if(match == null){
        match = Match.getMatch(getCapaciteNotre());
      }
    }

    /**
     * faire tourner le Club
    */
    public void run() {
      while (annee <= anneeMax) {
        mettreAJour();
        participerAuMatch();
        sePresenter2();
      }
    }

    /**
     * faire tourner le Club avec un nombre precise d'annees en parametres
    */
    public void run(int nbAnnees) {
      while (annee <= nbAnnees) {
        mettreAJour();
        participerAuMatch();
        sePresenter2();
      }
    }

    public static void resetAnnee(){
        annee = 0;
    }
}
