package com.company.bulider;

import com.company.interfaces.IDogBulider;

public class Dog implements IDogBulider {
    private String name;
    private BreedOfDog breedOfDog;
    private int age;
    private String size;
    private String color;


    @Override
    public Dog name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Dog breedOfDog(BreedOfDog breedOfDog) {
        this.breedOfDog = breedOfDog;
        return this;
    }

    @Override
    public Dog age(int age) {
        this.age = age;
        return this;
    }

    @Override
    public Dog size(String size) {
        this.size = size;
        return this;
    }

    @Override
    public Dog color(String color) {
        this.color = color;
        return this;
    }

    public Dog build(){
        if(name.isEmpty()){
            throw new IllegalStateException("Name can't be empty");
        }
        Dog dog = new Dog();
        dog.name = this.name;
        dog.breedOfDog = this.breedOfDog;
        dog.age = this.age;
        dog.size = this.size;
        dog.color = this.color;
        return dog;
    }

    public String getName() {
        return name;
    }

    public BreedOfDog getBreedOfDog() {
        return breedOfDog;
    }

    public int getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
