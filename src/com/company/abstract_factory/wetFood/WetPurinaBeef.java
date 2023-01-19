package com.company.abstract_factory.wetFood;

import com.company.abstract_factory.Food;

public class WetPurinaBeef implements Food {
    @Override
    public void giveFood() {
        System.out.println("Put wet beef from Purina to the bowl");
    }
}
