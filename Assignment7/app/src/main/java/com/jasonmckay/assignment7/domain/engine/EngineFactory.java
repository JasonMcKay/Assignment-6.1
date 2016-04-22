package com.jasonmckay.assignment7.domain.engine;

/**
 * Created by JasonMckay on 19-Apr-16.
 */
public class EngineFactory
{
    private static EngineFactory engineFactory = null;

    public EngineFactory() {
    }

    public static EngineFactory getEngineFactoryInstance()
    {
        if(engineFactory == null)
        {
            return new EngineFactory();
        }
        return engineFactory;
    }

    public EngineType getEngineType(String fuelType)
    {
        if(fuelType.equalsIgnoreCase("Diesel"))
        {
            return new Diesel();
        }
        else if(fuelType.equalsIgnoreCase("Unleaded"))
        {
            return new UnleadedPetrol();
        }
        else
        {
            return new LeadedPetrol();
        }
    }
}
