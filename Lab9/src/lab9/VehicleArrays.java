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
 * Quintin Oliver Section 90 TA: Katrina Scott Michael Ondrasek
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
        
        GregorianCalendar date = getDate(keyboard);
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
                "array and\nthe ArrayList.");
    }//end showDescription
    
    
    static void showInstructions(){
        System.out.println("Please enter a string for the car type followed by a positive integer for the number of wheels followed by a positive decimal number for the engine size followed by \"true\" or \"false\" if the vehicle has power steering followed by a purchase date in the format \"mm/dd/yyyy\" for each vehicle.\n")
    }
    
    /**
     * Gets the next string on the input buffer.
     * @param input The Scanner object used to get user input.
     * @return The next string on the input buffer.
     */
    static String getNextString(Scanner input){
        // Create a string to return as valid.
        String validString = "";
        
        // Get the next string object.
        validString = input.next();
        
        // Return the valid string.
        return validString;
    }//end getNextString
    
    /**
     * Gets the next double from the Scanner
     * <dl>
     *   <dt><b>Precondition:</b></dt><dd>Scanner object must be open.</dd>
     *   <dt><b>Postcondition:</b></dt><dd>N/A</dd>
     * @param input The Scanner object used to get user input
     * @return The next double in the datastream.
     */
    static double getNextDouble(Scanner input){
        // Create a varible for testing
        boolean valid = false;
        
        // Initialize a variable to hold the double number.
        double num = 0.0;
        
        // While the input is not valid...
        while(!valid){
            // Try to get the next double...
            try{
                num = input.nextDouble();
                valid = true;
            }catch(NoSuchElementException e){ // If there isn't one...
                input.next(); // Clear the buffer and tell the user.
                System.out.print("That was not a double. Please try again: ");
                valid = false;
            }
        }
        
        // Return the valid number.
        return num;
    }//end getNextDouble
    
    /**
     * Returns the next integer in the datastream.
     * <dl>
     *   <dt><b>Precondition:</b></dt><dd>The scanner object must be open</dd>
     *   <dt><b>Postcondition:</b></dt><dd>N/A</dd>
     * @param input The Scanner object used to get user input.
     * @return The next integer in the datastream.
     */
    static int getNextInt(Scanner input){
        // Create a varible for testing
        boolean valid = false;
        
        // Create a default variable for an integer value.
        int num = 0;
        
        // While the input isn't valid
        while(!valid){
            // Try to get the next int...
            try{
                num = input.nextInt();
                valid = true;
            }catch(NoSuchElementException e){ // If not then...
                input.next(); // Clear the buffer and tell the user
                System.out.print("That was not a int. Please try again: ");
                valid = false;
            }
        }
        
        // return valid integer value.
        return num;
    }//end getNextInt
    
    
    static String getVehicleType(Scanner input){
        return getNextString(input);
    }//end getVehicleType
    
    
    static int getNumberOfWheels(Scanner input){
        boolean valid = false;
        int wheels = 0;
        do{
            wheels = getNextInt(input);
            if((wheels == 3) || (wheels%2 == 0)){
                valid = true;
            }else{
                System.out.print("Please enter an even number greater than " +
                        "0 or enter 3: ");
            }
        }while(!valid);
        return wheels;
    }//end getNumberOfWheels
    
    
    static double getEngineSize(Scanner input){
        boolean valid = false;
        double size = 0;
        do{
            size = getNextDouble(input);
            if(size > 0){
                valid = true;
            }else{
                System.out.print("Please enter a number greater than 0: ");
            }
        }while(!valid);
        return size;
    }
    
    static boolean getPowerSteering(Scanner input){
        return input.nextBoolean();
    }
    
    /**
     * Gets a user defined date and turns it into a GregorianCalendar object.
     * @param input The Scanner object used to get user input.
     * @return The GregorianCalendar object containing the user entered date.
     */
    static GregorianCalendar getDate(Scanner input){
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
    static void testDate(int[] dates, Scanner input){
        String dateString = input.next();
        String[] datesArray;
        boolean valid = false;
        do{
            if(dateString.length() == 10){
                if(dateString.contains("/")){
                    datesArray = dateString.split("/");
                    if(datesArray.length == 3){
                        for(int i = 0; i < 3; i++){
                            try{
                                dates[i] = Integer.parseInt(datesArray[i]);
                                valid = true;
                            }catch(Exception e){
                                System.out.println("Incorrect format.");
                                valid = false;
                                dateString = input.next();
                            }
                        }
                    }
                }
            }else{
                System.out.println("Incorrect format.");
                dateString = input.next();
            }
        }while(!valid);
    }//end testDate
    
    static void getVehicles(MotorVehicle[] vehiclesArray, 
            ArrayList<MotorVehicle> vehiclesArrayList, Scanner input,
            int numberOfVehicles){
        for(int i = 0; i < numberOfVehicles; i++){
            try{
                vehiclesArray[i] = new MotorVehicle(getVehicleType(input), 
                        getNumberOfWheels(input), getEngineSize(input), 
                        getPowerSteering(input), getDate(input));
                vehiclesArrayList.add(i, vehiclesArray[i]);
            }catch(Exception e){
                i--;
                System.out.print("Incorrect input. Try again: ");
            }
        }
    }
}//end class
