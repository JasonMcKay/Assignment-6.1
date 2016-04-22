package com.jasonmckay.assignment7.factories.vehicle;

import org.junit.Test;

/**
 * Created by JasonMckay on 20-Apr-16.
 */
public class TestVehicleUpdate
{
    private VehicleBuilder vehicle;
    private Vehicle cVehicle;

    @Test
    public void testVehicleUpdate() throws Exception
    {
        vehicle = new VehicleBuilder();
        vehicle.buildDoors("two door");
        vehicle.buildEngine("unleaded");
        vehicle.modifyEngine("diesel");
        System.out.println(vehicle.getVehicle().toString());
    }
}
