package com.jasonmckay.assignment7;

import com.jasonmckay.assignment7.factories.manufacturer.TestManufacturerCreate;
import com.jasonmckay.assignment7.factories.manufacturer.TestManufacturerUpdate;
import com.jasonmckay.assignment7.factories.vehicle.TestVehicleCreate;
import com.jasonmckay.assignment7.factories.vehicle.TestVehicleUpdate;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by JasonMckay on 19-Apr-16.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestManufacturerCreate.class,
        TestManufacturerUpdate.class,
        TestVehicleCreate.class,
        TestVehicleUpdate.class
})
public class TestSuite {
}
