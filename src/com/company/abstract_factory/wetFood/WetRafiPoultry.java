package com.company.abstract_factory.wetFood;

import com.company.abstract_factory.Food;

public class WetRafiPoultry implements Food {
    @Override
    public void giveFood() {
        System.out.println("Put wet poultry from Purina to the bowl");
    }
}
