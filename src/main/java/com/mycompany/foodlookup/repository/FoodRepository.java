package com.mycompany.foodlookup.repository;

import com.mycompany.foodlookup.model.Food;
import com.mycompany.foodlookup.utils.FoodParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class FoodRepository {

    @Autowired
    private FoodParser foodParser;

    private List<Food> foods = new ArrayList<>();

    @PostConstruct
    private void init(){
        foodParser.parse(foods);
    }

    public List<Food> getFoods() {
        return foods;
    }
}
