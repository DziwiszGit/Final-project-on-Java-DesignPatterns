package com.company.dogDecorator;

import com.company.bulider.Dog;

public class DogWithHome {
    private Dog dog;

    public DogWithHome(Dog dog) {
        this.dog = dog;
    }

    public void home(){
        System.out.println(dog.getName() + " has a new Home");
    }

}
