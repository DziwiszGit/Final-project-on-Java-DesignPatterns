package com.company.abstract_factory;

public class UsingClass {
    public static void use(FoodFactory foodFactory){
        use(foodFactory.produce("poultry", FoodProducer.getRandom()));
        System.out.println();
        use(foodFactory.produce("beef", FoodProducer.getRandom()));
    }
    public static void use(Food food){
        Food.giveBowl();
        food.giveFood();
        Food.takeBowl();
        Food.cleanBowl();
    }
}
