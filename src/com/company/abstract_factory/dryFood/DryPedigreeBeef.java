package com.company.abstract_factory.dryFood;

import com.company.abstract_factory.Food;

public class DryPedigreeBeef implements Food {
    @Override
    public void giveFood() {
        System.out.println("Put dry beef from Pedigree to the bowl");
    }

}
