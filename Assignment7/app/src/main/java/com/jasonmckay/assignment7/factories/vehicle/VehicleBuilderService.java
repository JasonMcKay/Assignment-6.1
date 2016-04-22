package com.jasonmckay.assignment7.factories.vehicle;

/**
 * Created by JasonMckay on 19-Apr-16.
 */
public interface VehicleBuilderService
{
    public void buildEngine(String fuelType);
    public void buildDoors(String doorType);
    public void modifyEngine(String fuelType);
    public Vehicle getVehicle();
}
