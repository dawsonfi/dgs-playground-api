package com.dawson.dgs_playground_api.controller;

import com.dawson.dgs_playground_api.model.Restaurant;
import com.dawson.dgs_playground_api.repository.RestaurantRepository;
import com.netflix.graphql.dgs.DgsComponent;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DgsComponent
@RequiredArgsConstructor
public class RestaurantController {

    private RestaurantRepository restaurantRepository;

    public List<Restaurant> restaurants() {
        return restaurantRepository.findAll();
    }

}
