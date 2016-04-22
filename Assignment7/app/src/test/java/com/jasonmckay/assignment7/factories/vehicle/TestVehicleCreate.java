package com.jasonmckay.assignment7.factories.vehicle;

import org.junit.Test;

/**
 * Created by JasonMckay on 19-Apr-16.
 */
public class TestVehicleCreate
{
    private VehicleBuilder vehicle;
    private Vehicle cVehicle;

    @Test
    public void testVehicleCreate() throws Exception
    {
        vehicle = new VehicleBuilder();
        vehicle.buildDoors("two door");
        vehicle.buildEngine("unleaded");
        System.out.println(vehicle.getVehicle().toString());
    }
}
