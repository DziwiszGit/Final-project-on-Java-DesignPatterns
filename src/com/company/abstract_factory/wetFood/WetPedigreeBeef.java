package com.company.abstract_factory.wetFood;

import com.company.abstract_factory.Food;

public class WetPedigreeBeef implements Food {
    @Override
    public void giveFood() {
        System.out.println("Put wet beef from Pedigree to the bowl");
    }
}
