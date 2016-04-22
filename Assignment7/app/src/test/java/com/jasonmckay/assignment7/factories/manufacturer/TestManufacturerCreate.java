package com.jasonmckay.assignment7.factories.manufacturer;

import com.jasonmckay.assignment7.factories.manufacturer.Manufacturer;

import org.junit.*;

/**
 * Created by JasonMckay on 19-Apr-16.
 */
public class TestManufacturerCreate
{
    private Manufacturer manufacturer;

    @Before
    public void setUp() throws Exception
    {
        System.out.println("*****In test case create*****");
    }

    @Test
    public void testName() throws Exception
    {
        manufacturer = new Manufacturer.Builder()
                .vehicle("leaded", "four door")
                .vehicleID(1)
                .build();
        manufacturer.print();
    }
}
