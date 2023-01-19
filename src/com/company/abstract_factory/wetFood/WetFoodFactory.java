package com.company.abstract_factory.wetFood;

import com.company.abstract_factory.Food;
import com.company.abstract_factory.FoodProducer;
import com.company.abstract_factory.FoodFactory;
import com.company.abstract_factory.dryFood.*;

public class WetFoodFactory implements FoodFactory {
    @Override
    public Food produce(String typeOfMeat, FoodProducer foodProducer) {
        return switch(typeOfMeat){
            case "poultry" -> switch(foodProducer){
                case PEDIGREE -> new WetPedigreePoultry();
                case RAFI -> new WetRafiPoultry();
                case PURINA -> new WetPurinaPoultry();
                case DOLINA_NOTECI -> new WetDolinaNoteciPoultry();
            };
            case "beef" -> switch (foodProducer){
                case PEDIGREE -> new WetPedigreeBeef();
                case RAFI -> new WetRafiBeef();
                case PURINA -> new WetPurinaBeef();
                case DOLINA_NOTECI -> new WetDolinaNoteciBeef();
            };
            default -> new WetPedigreePoultry();
        };
    }
}
