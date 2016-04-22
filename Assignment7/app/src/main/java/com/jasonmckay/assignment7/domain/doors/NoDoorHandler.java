package com.jasonmckay.assignment7.domain.doors;

/**
 * Created by JasonMckay on 19-Apr-16.
 */
public class NoDoorHandler extends DoorHandler {
    @Override
    public String handleRequest(String request) {
        if(request.equalsIgnoreCase("No doors"))
        {
            return "No doors";
        }
        else
        {
            return successor.handleRequest(request);
        }
    }
}
