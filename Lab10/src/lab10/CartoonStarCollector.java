/**
* This program utilizes an ArrayList of CartoonStar objects to read and write
* information to and from a file. The user enters the data for each cartoon
* star then indicates if he/she wants to continue with another cartoon or not.
* After saving the ArrayList to a file, the program will then print the file
* contents to the console for the user to see.
*/
package lab10;

/**
* Quintin Oliver
* Section 90
* TA: Katrina Scott
* Michael Ondrasek 
*/
public class CartoonStarCollector {
    public static void main(String[] args) {
        // Create a default DataInput object
        DataInput keyboard = new DataInput();
        // Create a variable to tell if the user wants to input more data.
        boolean moreInput = false;
        
        // Create an ArrayList object for storing the Cartoon Stars
        ArrayList<CartoonStar> cartoonStars = new ArrayList<>();
        // Repeat while the user wants to input more data.
        do {
           String name = getCartoonName(keyboard);
           CartoonType cartoonType = getCartoonType(keyboard);
           int popularityIndex = getPopularityIndex(keyboard);
           cartoonStars.add(new CartoonStar(name, cartoonType, popularityIndex));
        } while (moreInput);
        
        // Save the file
        String filename = dataInput.getNext();
        File file = new File(filename);
        PrintWriter writer = new PrintWriter(file);
        for(CartoonStar cs : cartoonStars){
            writer.println(cs.getName() + " " + cs.getCartoonType().toString() + " " + cs.getPopularityIndex());
        }
        writer.close();
        // Print the results from the file.
        DataInput inputFile = new DataInput(file);
        
    }//end main
    
    /**
     * Get the type of cartoon from user entered data.
     * @param input The DataInput object used to handle data input.
     * @return The type of the cartoon
     * @throws IncorrectInputException Thrown if choice is outside of the
     *         allowed range
     */
    static CartoonType getCartoonType(DataInput input) throws 
            IncorrectInputException{
        // Create a variable used to test the input.
        boolean validInput = false;
        // Create a default for the choice input.
        int choice = -1;
        
        // While the input is incorrect, reprompt.
        do {
            // Try to get the input
            try{
                choice = input.getNextInt();
                // If it's outside of the acceptable range, throw an error
                if((choice < 1) || (choice > 10)){
                    throw new IncorrectInputException("The cartoon type must "
                            + "be an integer between 1 and 10.");
                }
                validInput = true;
            }catch(IncorrectInputException iie){
                // If the error is caught, tell the user and reprompt.
                validInput = false;
                System.out.println(iie);
                System.out.print("Please enter an integer 1 through 10: ");
            }
        } while (!validInput);
        
        // Using the user input, assign the cartoon a CartoonType.
        switch(choice){
            case 1:
                return CartoonType.FOX;
            case 2:
                return CartoonType.MOUSE;
            case 3:
                return CartoonType.RABBIT;
            case 4:
                return CartoonType.CHICKEN;
            case 5:
                return CartoonType.CAT;
            case 6:
                return CartoonType.DOG;
            case 7:
                return CartoonType.FISH;
            case 8:
                return CartoonType.BIRD;
            case 9:
                return CartoonType.DUCK;
            case 10:
                return CartoonType.RAT;
            default:
                throw new IncorrectInputException("Error in input. Cartoon "
                        + "type " + choice + " does not exist!");
        }
    }//end getCartoonType
    
    /**
     * Gets the popularity index for the cartoon being created.
     * @param input The DataInput object used to get input.
     * @return The popularity index of the cartoon.
     */
    static int getPopularityIndex(DataInput input) {
        // Create a variable for testing input.
        boolean validInput = false;
        // Create a default variable for the popularity index.
        int index = -1;
        
        // Repeatedly try to get a correct popularity index.
        do {
            // Try to get a popularity index.
            try{
                index = input.getNextInt();
                // If the index isn't in the acceptable range, throw an error.
                if((index < 1) || (index > 100)){
                    throw new IncorrectInputException("The popularity index "
                            + "must be an integer between 1 and 10.");
                }
                validInput = true;
            }catch(IncorrectInputException iie){
                // If the error is caught, reprompt.
                validInput = false;
                System.out.println(iie);
                System.out.print("Please enter an integer 1 through 100: ");
            }
        } while (!validInput);
        // Return the correct popularity index.
        return index;
    }
    
    /**
     * Return the user entered name of the cartoon star.
     * @param input The DataInput object used to get input.
     * @return The name of the cartoon star.
     */
    static String getCartoonName(DataInput input){
        return input.getNextLine(); // Return the next user entered line.
    }//end getCartoonName
    
    
}//end class
