package com.company.abstract_factory.dryFood;

import com.company.abstract_factory.Food;

public class DryDolinaNoteciPoultry implements Food {
    @Override
    public void giveFood() {
        System.out.println("Put dry poultry from Dolina Noteci to the bowl");
    }
}
