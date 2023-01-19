package com.company.interfaces;

import com.company.bulider.BreedOfDog;
import com.company.bulider.Dog;

public interface IDogBulider {
    Dog name(String name);
    Dog breedOfDog(BreedOfDog breedOfDog);
    Dog age(int age);
    Dog size(String size);
    Dog color(String color);
}
