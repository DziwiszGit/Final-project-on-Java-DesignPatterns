package com.company.functionalPrograming;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public record RandomHistory(String name) {
    public RandomHistory add(){
        return new RandomHistory(name);
    }

    public void writeSomeHistory(){
        List<String> histories = List.of(
                name + " got to the shelter 2 years ago, while a week before Christmas, a family took him to his home",
                name + " spent his whole life in the shelter and is a favorite of the pupils",
                name + " loves playing with the ball",
                name + " is the most charming dog in our shelter",
                name + " is a dangerous dog",
                name + " find a house and waits for new owners",
                name + " returned to us for the second time"
        );
        System.out.println(histories.get(randomDigit(histories.size())));
    }
    private int randomDigit(int max){
       return ThreadLocalRandom.current().nextInt(max - 1);
    }
}
