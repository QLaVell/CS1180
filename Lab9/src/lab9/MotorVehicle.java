package lab9;

import java.util.*;

/**
 * This class is used to create vehicles of different types.
 * @author Quintin
 */
public class MotorVehicle{
    private String vehicleType;
    private int numberWheels;
    private double engineSize;
    private boolean powerSteering;
    private GregorianCalendar purchaseDate;

    /**
     * No parameter constructor. Creates a motor vehicle with default values.
     */
    public MotorVehicle() {
        // Call a constructor that sets all instance variables.
        this("Coupe", 4, 1.6, true, new GregorianCalendar());
    }//end constructor

    /**
     * Creates a motor vehicle with a given type and other default values.
     * @param vehicleType The type of vehicle for the instance.
     */
    public MotorVehicle(String vehicleType) {
        // Call a constructor that sets all instance variables.
        this(vehicleType, 4, 1.6, true, new GregorianCalendar());
    }//end constructor

    /**
     * Creates a completely specified vehicle. May be called by other 
     * constructors.
     * @param vehicleType The type of vehicle to be created.
     * @param numberWheels The number of wheels the vehicle has.
     * @param engineSize The size of the engine in the vehicle.
     * @param powerSteering True if the vehicle has power steering.
     * @param purchaseDate The date the vehicle was purchased.
     */
    public MotorVehicle(String vehicleType, int numberWheels, double engineSize,
            boolean powerSteering, GregorianCalendar purchaseDate){
        // Set the instance variables.
        this.vehicleType = vehicleType;
        this.numberWheels = numberWheels;
        this.engineSize = engineSize;
        this.powerSteering = powerSteering;
        this.purchaseDate = purchaseDate;
    }//end constructor

    /**
     * Sets the vehicle type.
     * @param vehicleType The vehicle type to be set.
     */
    public void setVehicleType(String vehicleType) {
        // Set the vehicle type.
        this.vehicleType = vehicleType;
    }//end setVehicleType

    /**
     * Returns the vehicle type.
     * @return The vehicle type stored in this instance.
     */
    public String getVehicleType() {
        return vehicleType; // return the vehicle type.
    }//end getVehicleType

    /**
     * Sets the number of wheels for the vehicle instance.
     * @param numberWheels The number of wheels for this instance.
     */
    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }//end setNumberWheels

    /**
     * Returns the number of wheels in this instance.
     * @return The number of wheels set for this vehicle.
     */
    public int getNumberWheeld() {
        return numberWheels;
    }//end getNumberWheels

    /**
     * Sets the engine size for this vehicle.
     * @param engineSize The size to set the engine size to.
     */
    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }//end setEngineSize

    /**
     * Return the engine size of this vehicle.
     * @return The size of the engine of this instance.
     */
    public double getEngineSize() {
        return engineSize;
    }//end getEngineSize

    /**
     * Sets the power steering of this vehicle, True for has power steering.
     * @param powerSteering The variable to set powerSteering to.
     */
    public void setPowerSteering(boolean powerSteering){
        this.powerSteering = powerSteering;
    }//end setPowerSteering

    /**
     * Returns the powerSteering variable to the user.
     * @return The powerSteering variable for this instance.
     */
    public boolean getPowerSteering(){
        return powerSteering;
    }//end getPowerSteering

    /**
     * Sets the purchase date of the vehicle.
     * @param purchaseDate The purchase date of the vehicle.
     */
    public void setPurchaseDate(GregorianCalendar purchaseDate){
        this.purchaseDate = purchaseDate;
    }//end setPurchaseDate.
    
    /**
     * Returns the date of purchase as a GregorianCalendar object.
     * @return The date the vehicle was purchased.
     */
    public GregorianCalendar getPurchaseDate(){
        return purchaseDate;
    }//end getPurchaseDate
}//end MotorVehicle class