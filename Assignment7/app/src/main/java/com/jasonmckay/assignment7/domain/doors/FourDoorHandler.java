package com.jasonmckay.assignment7.domain.doors;

/**
 * Created by JasonMckay on 19-Apr-16.
 */
public class FourDoorHandler  extends DoorHandler {
    @Override
    public String handleRequest(String request) {
        if(request.equalsIgnoreCase("Four door"))
        {
            return "Four door";
        }
        else
        {
            return successor.handleRequest(request);
        }
    }
}
