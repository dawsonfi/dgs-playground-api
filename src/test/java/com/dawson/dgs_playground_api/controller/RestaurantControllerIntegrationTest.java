package com.dawson.dgs_playground_api.controller;


import com.dawson.dgs_playground_api.model.Restaurant;
import com.dawson.dgs_playground_api.repository.RestaurantRepository;
import com.jayway.jsonpath.TypeRef;
import com.netflix.graphql.dgs.DgsQueryExecutor;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class RestaurantControllerIntegrationTest {

    private static final TypeRef<List<Restaurant>> CONTENT_WIDGETS_TYPE = new TypeRef<>() {};
    private static final String WIDGETS_PATH = "data.widgets";

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private DgsQueryExecutor dgsQueryExecutor;

    @Test
    void testGetAllWidgets() throws Exception {
        final List<Restaurant> existingWidgets = restaurantRepository.findAll();
        final String query = "{ restaurants { id name slug description type logoUrl coverUrl} }";

        final List<Restaurant> widgets = dgsQueryExecutor.executeAndExtractJsonPathAsObject(query, WIDGETS_PATH, CONTENT_WIDGETS_TYPE);

        Assertions.assertThat(widgets).hasSize(0);
        Assertions.assertThat(widgets).isEqualTo(existingWidgets);
    }

}