package com.dawson.dgs_playground_api.mcp;

import com.dawson.dgs_playground_api.model.RestaurantType;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class RestaurantsMcp {

    @Tool(description = "Return Restaurants by Food Type")
    public String getRestaurantsByFoodType(final RestaurantType restaurantType) {
        return String.format("Hacienda %s", restaurantType);
    }

}
