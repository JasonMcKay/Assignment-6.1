package com.jasonmckay.assignment7.factories.vehicle;

import com.jasonmckay.assignment7.domain.engine.*;

/**
 * Created by JasonMckay on 19-Apr-16.
 */
public class VehicleBuilder implements VehicleBuilderService
{
    private Vehicle vehicle;
    private EngineFactory engine;
    private EngineType engineType;

    public VehicleBuilder()
    {
        vehicle = new Vehicle();
        engine = EngineFactory.getEngineFactoryInstance();
    }

    public void buildEngine(String fuelType)
    {
        engineType = engine.getEngineType(fuelType);
        vehicle.setEngine(engineType);
    }

    public void modifyEngine(String fuelType)
    {
        engineType = engine.getEngineType(fuelType);
        vehicle.setEngine(engineType);
    }

    public void buildDoors(String doorType) {
        vehicle.setDoors(doorType);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
