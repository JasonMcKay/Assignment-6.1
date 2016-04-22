package com.jasonmckay.assignment7.domain.doors;

/**
 * Created by JasonMckay on 19-Apr-16.
 */
public class TwoDoorHandler extends DoorHandler {
    @Override
    public String handleRequest(String request) {
        if(request.equalsIgnoreCase("Two door"))
        {
            return "Two door";
        }
        else
        {
            return successor.handleRequest(request);
        }
    }
}
