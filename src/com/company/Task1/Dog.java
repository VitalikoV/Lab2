package com.company.Task1;

public class Dog extends Animal{
    private String description;
    private static String staticDescription;
    private String generalMessage;
    public Dog(){
        generalMessage = "I identify myself as a Dog";
        System.out.println("Message: " + generalMessage);
    }
    static {
        staticDescription = "Like to eat";
        System.out.println("Static description of a dog: " + staticDescription);
    }
    {
        description = "Can ran very fast";
        System.out.println("Description of the dog: " + description);
    }
}
