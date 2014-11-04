package lab9;

/**
* An exception class used when the input is not what is expected.
* @author Quintin Oliver
*/
public class IncorrectInputException extends Exception {
    
    /**
     * A constructor used to create an exception from an incorrect int input.
     * @param message The message to tell the user. (e.g. "The int must be 
     *                greater than 0").
     * @param num The invalid data entered by the user.
     */
    public IncorrectInputException(String message, int num){
        super(message + "\nData input: " + num); // Create an Exception with this message.
    }//end constructor
    
    /**
     * A constructor used to create an exception from an incorrect double input.
     * @param message The message to tell the user. (e.g. "The double must be 
     *                greater than 0").
     * @param num The invalid data entered by the user.
     */
    public IncorrectInputException(String message, double num){
        super(message + "\nData input: " + num); // Create an Exception with this message.
    }//end constructor
    
    /**
     * A constructor used to create an exception from an incorrect String input.
     * @param message The message to tell the user. (e.g. "The String must be 
     *                longer than 0").
     * @param msg The invalid data entered by the user.
     */
    public IncorrectInputException(String message, String msg){
        super(message + "\nData input: " + msg); // Create an Exception with this message.
    }//end constructor
}//end class
