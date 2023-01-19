package com.company.abstract_factory;

import java.util.concurrent.ThreadLocalRandom;

public enum FoodProducer {
    DOLINA_NOTECI,
    RAFI,
    PEDIGREE,
    PURINA;

    public static FoodProducer getRandom(){
        FoodProducer[] producers = FoodProducer.values();
        int index = ThreadLocalRandom.current().nextInt(values().length);

        return producers[index];
    }
}
