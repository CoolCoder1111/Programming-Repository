 
package com.mycompany.navigationproject;

public class Location 
{
   private String LocationName;
   private int x;
   private int y;
   private boolean GasStation;

    public Location(String LocationName, int x, int y, boolean GasStation) {
        this.LocationName = LocationName;
        this.x = x;
        this.y = y;
        this.GasStation = GasStation;
    }

    public String getLocationName() {
        return LocationName;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isGasStation() {
        return GasStation;
    }

    
    
    }