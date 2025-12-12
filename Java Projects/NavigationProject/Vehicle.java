
package com.mycompany.navigationproject;

public class Vehicle {
    
    private Location location;
    private int MaxFuelCap;
    private double CurrentFuel;
    private int MPG;

    public Vehicle(Location location, int MaxFuelCap, int CurrentFuel, int MPG) {
        this.location = location;
        this.MaxFuelCap = MaxFuelCap;
        this.CurrentFuel = CurrentFuel;
        this.MPG = MPG;
    }
    public void Drive(Location newLocation) 
    {
       double Dx = location.getX() - newLocation.getX();
       double Dy = location.getY() - newLocation.getY();
       
       double d = Math.sqrt(Math.pow(Dx, 2) + Math.pow(Dy, 2));
       
       double neededFuel = d / MPG;
       
       neededFuel = Math.round(neededFuel);
       
        if (neededFuel <= CurrentFuel) 
        {
           location = newLocation;
           
           CurrentFuel -= neededFuel;
        }
        else{
            System.out.println("no");
        }
       
    }
    
    public void refuel(boolean GasStation) 
    {
        if(location.isGasStation()){
            CurrentFuel = MaxFuelCap;
        }
        
    }
    
    public double CurrentFuel() {
        return CurrentFuel;
    }

    @Override
    public String toString() {
        return location.getLocationName() + "(" + location.getX()+ "," + location.getY()+ ")" + " Your current fuel is: " + CurrentFuel();
    }
}

