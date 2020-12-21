public interface Evaluable {
    
    /**
     * Voir si cette personne est compétente (la capacite depasse un certain seuil)
     * Si oui, passe
     * Sinon, return false pour son remplacement ulterieur
    */
    public boolean evaluer();


    /**
     * lors de vieillissement, les capacites d'un joueur ou d'un coach declinent
     * ce qui lui rend moins capable et à la fin il doit être remplacé par un nouveau
    */
    public void decliner();
    

}
