package com.company;

import com.company.abstract_factory.UsingClass;
import com.company.abstract_factory.dryFood.DryFoodFactory;
import com.company.abstract_factory.wetFood.WetFoodFactory;
import com.company.bulider.BreedOfDog;
import com.company.bulider.Dog;
import com.company.dogDecorator.DogWithHome;
import com.company.functionalPrograming.RandomHistory;
import com.company.singleton.Shelter;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog()
                .name("Fafik")
                .breedOfDog(BreedOfDog.AKITA)
                .age(5)
                .color("Grey")
                .size("Big");

        new DogWithHome(dog).home();

        System.out.println(Shelter.getShelter("Animal corner").name);
        System.out.println(Shelter.getShelter("Cute Animals").name);

        RandomHistory randomHistory = new RandomHistory(dog.getName());
        randomHistory.writeSomeHistory();

        System.out.println("\n");
        UsingClass.use(new DryFoodFactory());
        System.out.println("\n");
        UsingClass.use(new WetFoodFactory());

    }


}
