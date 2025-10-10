package com.dawson.dgs_playground_api.repository;


import com.dawson.dgs_playground_api.model.Restaurant;
import com.dawson.dgs_playground_api.model.RestaurantType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.AUTO_CONFIGURED)
class RestaurantRepositoryTest {

    @Autowired
    private RestaurantRepository repository;

    @Test
    void shouldSaveRestaurant() {
        final Restaurant restaurant = buildRestaurant();

        final Restaurant savedRestaurant = repository.save(restaurant);

        assertNotNull(savedRestaurant.getId());
    }

    private static Restaurant buildRestaurant() {
        return Restaurant.builder()
                .name("Potato Food")
                .slug("potato")
                .description("All sorts of potatoes in different ways")
                .type(RestaurantType.BRAZILIAN)
                .logoUrl("https://potato.com/logo.jpg")
                .coverUrl("https://potato.com/cover.jpg")
                .build();
    }
}