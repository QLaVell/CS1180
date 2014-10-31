package lab9;

import java.util.*;

public class MotorVehicle{
  private String vehicleType;
  private int numberWheels;
  private double engineSize;
  private boolean powerSteering;
  private GregorianCalendar purchaseDate;
  
  public MotorVehicle() {
    vehicleType = "Coupe";
    numberWheels = 4;
    engineSize = 1.6;
    powerSteering = true;
    purchaseDate = new GregorianCalendar();
  }
  
  public MotorVehicle(String vehicleType) {
    this.vehicleType = vehicleType;
    numberWheels = 4;
    engineSize = 1.6;
    powerSteering = true;
    purchaseDate = new GregorianCalendar();
  }
  
  public MotorVehicle(String vehicleType, int numberWheels, double engineSize, boolean powerSteering, GregorianCalendar purchaseDate){
    this.vehicleType = vehicleType;
    this.numberWheels = numberWheels;
    this.engineSize = engineSize;
    this.powerSteering = powerSteering;
    this.purchaseDate = purchaseDate;
  }
  
  public void setVehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
  }
  
  public String getVehicleType() {
    return vehicleType;
  }
  
  public void setNumberWheels(int numberWheels) {
    this.numberWheels = numberWheels;
  }
  
  public int getNumberWheeld() {
    return numberWheels;
  }
  
  public void setEngineSize(double engineSize) {
    this.engineSize = engineSize;
  }
  
  public double getEngineSize() {
    return engineSize;
  }
  
  public void setPowerSteering(boolean powerSteering){
    this.powerSteering = powerSteering;
  }
 }