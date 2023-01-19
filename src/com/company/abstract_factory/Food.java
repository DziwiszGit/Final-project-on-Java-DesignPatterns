package com.company.abstract_factory;

public interface Food {
    static void giveBowl(){
        System.out.println("Put the bowl on the floor");
    }
    void giveFood();
    static void takeBowl(){
        System.out.println("Take the bowl from the floor");
    }
    static void cleanBowl(){
        System.out.println("Cleaning the bowl");
    }
}