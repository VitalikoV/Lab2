package com.company.Task1;

public class Animal implements Creature{
    private String description;
    private static String staticDescription;
    private String generalMessage;
    public Animal(){
        generalMessage = "I'm an animal";
        System.out.println("Message: " + generalMessage);
    }
    static {
        staticDescription = "Creature, that can live";
        System.out.println("Static description of an animal: " + staticDescription);
    }
    {
        description = "Like to sleep";
        System.out.println("Description of an animal: " + description);
    }
}
