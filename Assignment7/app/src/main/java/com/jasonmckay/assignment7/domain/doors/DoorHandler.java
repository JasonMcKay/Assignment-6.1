package com.jasonmckay.assignment7.domain.doors;

/**
 * Created by JasonMckay on 19-Apr-16.
 */
public abstract class DoorHandler {
    DoorHandler successor;

    public void setSuccessor(DoorHandler successor)
    {
        this.successor = successor;
    }

    public abstract String handleRequest(String request);
}
