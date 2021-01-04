/**
 * Exception declenche quand le salaire va depasser le plafond
*/
public class DepassementPlafondSalaireException extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public DepassementPlafondSalaireException(String message) {
        super(message);
    }
    
    
}
