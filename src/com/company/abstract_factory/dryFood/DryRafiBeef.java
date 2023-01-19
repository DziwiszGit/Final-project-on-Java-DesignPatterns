package com.company.abstract_factory.dryFood;

import com.company.abstract_factory.Food;

public class DryRafiBeef implements Food {
    @Override
    public void giveFood() {
        System.out.println("Put dry beef from Rafi to the bowl");
    }

}
