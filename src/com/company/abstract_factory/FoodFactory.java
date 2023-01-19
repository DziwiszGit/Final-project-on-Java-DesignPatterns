package com.company.abstract_factory;

import com.company.abstract_factory.Food;
import com.company.abstract_factory.FoodProducer;

public interface FoodFactory {
    Food produce(String typeOfMeat, FoodProducer foodProducer);
}
