package com.timtro.modules.listing.model;

import com.timtro.core.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "service_packages")
public class ServicePackage extends BaseEntity {

    @Column(nullable = false, length = 100)
    private String name;

    @Column(name = "price_per_day", nullable = false, precision = 10, scale = 2)
    private BigDecimal pricePerDay;

    @Column(name = "priority_level")
    private Integer priorityLevel = 0;

    @Column(columnDefinition = "JSON")
    private String features; // JSON string

    @Column(name = "is_active")
    private Boolean isActive = true;
}
