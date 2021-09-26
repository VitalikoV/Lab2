package com.company.Task1;

public class Dobermann extends Dog{
    private String description;
    private static String staticDescription;
    private String generalMessage;
    public Dobermann(){
        generalMessage = "I identify myself as a Dobermann";
        System.out.println("Message: " + generalMessage);
    }
    static {
        staticDescription = "Really like to eat and sleep";
        System.out.println("Static description of Dobermann: " + staticDescription);
    }
    {
        description = "Can be furious and joyful at the same moment";
        System.out.println("Description of Dobermann: " + description);
    }

}
