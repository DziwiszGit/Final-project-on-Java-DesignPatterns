package com.company.abstract_factory.dryFood;

import com.company.abstract_factory.Food;

public class DryRafiPoultry implements Food {
    @Override
    public void giveFood() {
        System.out.println("Put dry poultry from Rafi to the bowl");
    }

}
