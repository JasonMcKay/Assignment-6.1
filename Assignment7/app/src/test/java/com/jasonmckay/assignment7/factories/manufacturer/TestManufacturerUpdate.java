package com.jasonmckay.assignment7.factories.manufacturer;

import com.jasonmckay.assignment7.factories.manufacturer.Manufacturer;
import com.jasonmckay.assignment7.factories.vehicle.Vehicle;

import org.junit.*;

/**
 * Created by JasonMckay on 19-Apr-16.
 */
public class TestManufacturerUpdate {
    private Manufacturer manufacturer, updateManufacturer;

    @Before
    public void setUp() throws Exception
    {
        System.out.println("*****In test case update*****");
        manufacturer = new Manufacturer.Builder()
                .vehicle("leaded", "four door")
                .vehicleID(1)
                .build();
        //manufacturer.print();
    }

    @Test
    public void testModifyEntity() throws Exception
    {
        updateManufacturer = new Manufacturer.Builder()
                .copy(manufacturer)
                .modifyVehicle("diesel")
                .build();
        updateManufacturer.print();
    }
}
