package com.company.singleton;

public final class Shelter {
    private static volatile Shelter shelter;
    public String name;

    private Shelter(String name){
        this.name = name;
    }
    public static Shelter getShelter(String name){
        Shelter result = shelter;
        if(result != null){
            return shelter;
        }
        synchronized(Shelter.class) {
            if (shelter == null) {
                shelter = new Shelter(name);
            }
            return shelter;
        }
    }
}
