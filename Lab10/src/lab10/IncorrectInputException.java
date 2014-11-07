package lab10;

/**
* An exception class used when the input is not what is expected.
* @author Quintin Oliver
*/
public class IncorrectInputException extends Exception {
    // A String variable used to store a message for the user.
    private final String MESSAGE;
    
    /**
     * A constructor used to create an exception from an incorrect int input.
     * @param message The message to tell the user. (e.g. "The int must be 
     *                greater than 0").
     */
    public IncorrectInputException(String message){
        // Create an Exception with this message.
        super(message); 
        
        // Save the message to this instance.
        this.MESSAGE = message;
    }//end constructor
    
    /**
     * Returns the string that the user will see when the error is thrown.
     * @return The string representation of the exception.
     */
    @Override
    public String toString(){
        return MESSAGE;
    }
}//end class
