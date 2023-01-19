package com.company.abstract_factory.wetFood;

import com.company.abstract_factory.Food;

public class WetPedigreePoultry implements Food {
    @Override
    public void giveFood() {
        System.out.println("Put wet poultry from Pedigree to the bowl");
    }
}
