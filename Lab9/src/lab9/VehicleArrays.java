/**
 * This is the Java program for Lab 9 of CS1180. The purpose of this lab is to
 * display use of arrays and ArrayList. The project will create an array and an
 * ArrayList of MotorVehicle objects and display them.
 */
package lab9;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Quintin Oliver 
 * Section 90 
 * TA: Katrina Scott 
 * Michael Ondrasek
 */
public class VehicleArrays {

    public static void main(String[] args) {
        // Create a scanner object for user input.
        Scanner keyboard = new Scanner(System.in);
        
        // Create a final variable for the number of vehicles to enter.
        final int NUMBER_OF_VEHICLES = 3;
        
        //Display the program description.
        showDescription();
        
        // Display the instructions for entering a vehicle.
        showInstructions();
        
        //GregorianCalendar date = getDate(keyboard);
//        System.out.printf("%02d/%02d/%4d\n",date.get(Calendar.MONTH) + 1,
//                date.get(Calendar.DATE), date.get(Calendar.YEAR));
    }//end main

    /**
     * Displays the program description.
     */
    static void showDescription() {
        System.out.println("This program will create both an array and an " +
                "ArrayList of\nMotorVehicle objects. It will prompt for the" +
                "MotorVehicle\ndata and then output the stored data from the " +
                "array and\nthe ArrayList.\n");
    }//end showDescription
    
    /**
     * Displays the instructions for created a vehicle object to the user.
     */
    static void showInstructions(){
        System.out.println("Please enter a string for the car type followed\n" + 
                "by a positive integer for the number of wheels followed by\n" +
                "a positive decimal number for the engine size followed by\n" +
                "\"true\" or \"false\" if the vehicle has power steering\n" +
                "followed by a purchase date in the format \"mm/dd/yyyy\"\n" +
                "for each vehicle.\n");
    }//end showInstructions
    
    /**
     * Gets the next string on the input buffer.
     * @param input The Scanner object used to get user input.
     * @return The next string on the input buffer.
     */
    static String getNextString(Scanner input) throws NoSuchElementException{
        // Return the next string.
        return input.next();
    }//end getNextString
    
    /**
     * Gets the next double from the Scanner
     * <dl>
     *   <dt><b>Precondition:</b></dt><dd>Scanner object must be open.</dd>
     *   <dt><b>Postcondition:</b></dt><dd>N/A</dd>
     * @param input The Scanner object used to get user input
     * @return The next double in the datastream.
     */
    static double getNextDouble(Scanner input) throws NoSuchElementException{
        // Return the next double
        return input.nextDouble();
    }//end getNextDouble
    
    /**
     * Returns the next integer in the datastream.
     * <dl>
     *   <dt><b>Precondition:</b></dt><dd>The scanner object must be open</dd>
     *   <dt><b>Postcondition:</b></dt><dd>N/A</dd>
     * @param input The Scanner object used to get user input.
     * @return The next integer in the datastream.
     */
    static int getNextInt(Scanner input) throws NoSuchElementException{
        // return the next integer value.
        return input.nextInt();
    }//end getNextInt
    
    /**
     * Returns the user entered vehicle type.
     * @param input The Scanner object used to get user input.
     * @return The String that represents the vehicle type.
     * @throws NoSuchElementException thrown if there is nothing in the input 
     *         buffer.
     */
    static String getVehicleType(Scanner input) throws NoSuchElementException{
        return getNextString(input);
    }//end getVehicleType
    
    /**
     * Returns the user entered number of wheels in for the vehicle.
     * @param input The Scanner object used to get user input.
     * @return The number of wheels for the vehicle.
     * @throws NoSuchElementException Thrown if the next item on the input 
     *         buffer is not an integer.
     * @throws IncorrectInputException Thrown if the number of wheels isn't 
     *         even or equal to 3.
     */
    static int getNumberOfWheels(Scanner input) throws NoSuchElementException, 
            IncorrectInputException{
        // Ask the user for the number of wheels.
        int wheels = getNextInt(input);
        // If it isn't equal to 3 or isn't even then throw an 
        // IncorrectInputException.
        if(!((wheels == 3) || (wheels%2 == 0))){
            throw new IncorrectInputException("The number of wheels must be " +
                    "an even number or equal to 3", wheels);
        }
        // Return the number of wheels.
        return wheels;
    }//end getNumberOfWheels
    
    /**
     * Returns the user entered engine size of this vehicle.
     * @param input The Scanner object used to get user input.
     * @return The size of the engine for this vehicle.
     * @throws NoSuchElementException Thrown if the next item on the buffer is 
     *         not a double.
     * @throws IncorrectInputException Thrown if the engine size is less than 0.
     */
    static double getEngineSize(Scanner input) throws NoSuchElementException,
            IncorrectInputException{
        // Get the engine size from the user.
        double size = getNextDouble(input);
        // If the size is less than or equal to 0 throw an 
        // IncorrectInputException.
        if(size <= 0){
            throw new IncorrectInputException("The engine size must be "
                    + "larger than 0.", size);
        }
        // Return the size.
        return size;
    }
    
    /**
     * Get the user entered boolean for powerSteering.
     * @param input The Scanner object used to get user input.
     * @return True if the vehicle has power steering.
     * @throws NoSuchElementException Thrown if there is no boolean in the 
     *         input buffer.
     */
    static boolean getPowerSteering(Scanner input)throws NoSuchElementException{
        return input.nextBoolean();
    }
    
    /**
     * Gets a user defined date and turns it into a GregorianCalendar object.
     * @param input The Scanner object used to get user input.
     * @return The GregorianCalendar object containing the user entered date.
     */
    static GregorianCalendar getDate(Scanner input) 
            throws IncorrectInputException{
        GregorianCalendar date = null;
        int[] dates = new int[3];
        
        // Get the user entered string for the date.
        testDate(dates, input);
        date = new GregorianCalendar(dates[2], dates[0]-1, dates[1]);
        return date;
    }//end getDate
    
    /**
     * Creates an array of ints from a date String.
     * @param dateString The string to be converted.
     * @param dates The array to save the converted date;
     */
    static void testDate(int[] dates, Scanner input) 
            throws IncorrectInputException{
        // Get the user entered date string. mm/dd/yyyy
        String dateString = input.next();
        String[] datesArray;
        // If it is the same length as the correct format
        if(dateString.length() == "mm/dd/yyyy".length()){
            // And it contains at least 1 /.
            if(dateString.contains("/")){
                // Create an array of strings from the date string.
                datesArray = dateString.split("/");
                // If it has 2 / then the length of the array should be 3.
                if(datesArray.length == 3){
                    // Iterate through the array and convert each string to an 
                    // int.
                    for(int i = 0; i < 3; i++){
                        try{
                            dates[i] = Integer.parseInt(datesArray[i]);
                        }catch(Exception e){
                            // If the parsing doesn't work, throw an exception
                            throw new IncorrectInputException("The date is " +
                                    "not formatted correctly.", dateString);
                        }
                    }
                }
            }
        }else{ // If it does not have 10 characters throw an exception
            throw new IncorrectInputException("The date is not formatted " + 
                    "correctly.", dateString);
        }
    }//end testDate
    
    /**
     * Creates an array and an ArrayList of a specified number of vehicles.
     * @param vehiclesArray The array to save the vehicles to.
     * @param vehiclesArrayList The ArrayList to save the vehicles to.
     * @param input The Scanner object used to get user input.
     * @param numberOfVehicles The number of vehicles to be created.
     */
    static void getVehicles(MotorVehicle[] vehiclesArray, 
            ArrayList<MotorVehicle> vehiclesArrayList, Scanner input,
            int numberOfVehicles){
        // Iterate through number of vehicles to be created.
        for(int i = 0; i < numberOfVehicles; i++){
            // try to create a vehicle.
            try{
                vehiclesArray[i] = new MotorVehicle(getVehicleType(input), 
                        getNumberOfWheels(input), getEngineSize(input), 
                        getPowerSteering(input), getDate(input));
                vehiclesArrayList.add(i, vehiclesArray[i]);
            }catch(IncorrectInputException iie){ // If the input is incorrect...
                // Decrement i to retry the vehicle creation.
                i--;
                // Print the error message so the user knows why the input was
                // wrong.
                System.out.println(iie);
            }catch(Exception e){// For any other error.
                // Decrement i to retry the vehicle creation.
                i--;
                // Tell the user to try again.
                System.out.print("Incorrect input. Try again: ");
            }// end try-catch
        }//end for loop
    }//end getVehicles
    
    
}//end class
