package com.company.abstract_factory.dryFood;

import com.company.abstract_factory.Food;

public class DryDolinaNoteciBeef implements Food {
    @Override
    public void giveFood() {
        System.out.println("Put dry beef from Dolina Noteci to the bowl");
    }

}
