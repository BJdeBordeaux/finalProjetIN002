/**
 * Cette classe ne comprend que des methodes
 * 
*/
public class Outil {
    
    /**
     * 
     * @param min
     * @param max
     * @return Un double dans [min, max)
    */
    public double aleatoire(int min, int max) {
        return Math.random()*(max - min) + min;
    }

    /**
     * 
     * @param min
     * @param max
     * @return un entier entre [min, max)
    */
    public int AleatoireInt(int min, int max){
        return (int) (Math.random()*(max - min + 1) + min);
    }
}
