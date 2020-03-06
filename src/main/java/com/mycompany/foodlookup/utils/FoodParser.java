package com.mycompany.foodlookup.utils;

import com.mycompany.foodlookup.model.Food;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FoodParser {

    @Value("${dummy.data.filename}")
    private String dummyDataFilename;

    public void parse(List<Food> foods){
        for (String[] items : DataFileReader.read(dummyDataFilename)) {
            Food food = new Food();
            food.setDescription(items[0]);
            food.setKcal(Integer.parseInt(items[1]));
            food.setProtein_g(Double.parseDouble(items[2]));
            food.setCarbohydrate_g(Double.parseDouble(items[3]));
            food.setSugar_g(Double.parseDouble(items[4]));
            foods.add(food);
        }
    }
}
