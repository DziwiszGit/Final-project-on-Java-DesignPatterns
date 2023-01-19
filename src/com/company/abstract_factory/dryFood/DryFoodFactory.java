package com.company.abstract_factory.dryFood;


import com.company.abstract_factory.Food;
import com.company.abstract_factory.FoodFactory;
import com.company.abstract_factory.FoodProducer;

public class DryFoodFactory implements FoodFactory {

    @Override
    public Food produce(String typeOfMeat, FoodProducer foodProducer) {
        return switch(typeOfMeat){
            case "poultry" -> switch(foodProducer){
                case PEDIGREE -> new DryPedigreePoultry();
                case RAFI -> new DryRafiPoultry();
                case PURINA -> new DryPurinaPoultry();
                case DOLINA_NOTECI -> new DryDolinaNoteciPoultry();
            };
            case "beef" -> switch (foodProducer){
                case PEDIGREE -> new DryPedigreeBeef();
                case RAFI -> new DryRafiBeef();
                case PURINA -> new DryPurinaBeef();
                case DOLINA_NOTECI -> new DryDolinaNoteciBeef();
            };
            default -> new DryPedigreePoultry();
        };
    }
}
