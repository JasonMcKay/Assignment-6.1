package com.jasonmckay.assignment7.domain.engine;

/**
 * Created by JasonMckay on 19-Apr-16.
 */
public class LeadedPetrol implements EngineType
{
    private String fuelType;
    private double capacity = 1200;
    private double oilInLiters = 1.6;

    public void setFuelType(String fuelType)
    {
        this.fuelType = fuelType;
    }

    public String fuelType() {
        return "Leaded petrol";
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getOilInLiters() {
        return oilInLiters;
    }

    public void setOilInLiters(double oilInLiters) {
        this.oilInLiters = oilInLiters;
    }

    public String toString()
    {
        return "Engine:"+"\nSize(cc): "+capacity+"\nLiters: "+oilInLiters;
    }
}
