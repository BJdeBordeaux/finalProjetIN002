class Main {
  public static void main(String[] args) {

    Club clubSimu = new Club();
    clubSimu.init();

    try{
      clubSimu.run(Integer.parseInt(args[0]));
    }
    catch(Exception e){
      clubSimu.run();
    }

    System.out.println("Pour gerer le nombre d'annee a tourne, tapez comme 'java Main 16' pour une boucle de 16 annee.");
  }
}