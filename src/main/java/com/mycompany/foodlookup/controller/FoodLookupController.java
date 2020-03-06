package com.mycompany.foodlookup.controller;

import com.mycompany.foodlookup.model.Food;
import com.mycompany.foodlookup.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodLookupController {

    @Autowired
    private FoodRepository foodRepository;

    @GetMapping
    public ResponseEntity<List<Food>> getFoods(){
        return ResponseEntity.ok(foodRepository.getFoods());
    }
}
