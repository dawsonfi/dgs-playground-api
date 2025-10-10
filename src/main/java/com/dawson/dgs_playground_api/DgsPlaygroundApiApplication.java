package com.dawson.dgs_playground_api;

import com.dawson.dgs_playground_api.mcp.RestaurantsMcp;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DgsPlaygroundApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DgsPlaygroundApiApplication.class, args);
	}

    @Bean
    public ToolCallbackProvider restaurantTools(final RestaurantsMcp restaurantsMcp) {
        return MethodToolCallbackProvider.builder().toolObjects(restaurantsMcp).build();
    }

}
