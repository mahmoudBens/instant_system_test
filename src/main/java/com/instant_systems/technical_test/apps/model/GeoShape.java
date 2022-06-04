package com.instant_systems.technical_test.apps.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class GeoShape {
    @Id
    private double[] coordinates;
    private String type;
}
