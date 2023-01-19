package com.company.abstract_factory.wetFood;

import com.company.abstract_factory.Food;

public class WetDolinaNoteciBeef implements Food {
    @Override
    public void giveFood() {
        System.out.println("Put wet beef from Dolina Noteci to the bowl");
    }
}
