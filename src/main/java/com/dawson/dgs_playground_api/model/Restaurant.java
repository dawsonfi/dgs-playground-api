package com.dawson.dgs_playground_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String name;
    @Column(nullable = false)
    String slug;
    @Column(nullable = false)
    String description;
    @Column(nullable = false)
    RestaurantType type;
    @Column(nullable = false)
    String logoUrl;
    @Column(nullable = false)
    String coverUrl;

}
