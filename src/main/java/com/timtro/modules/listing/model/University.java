package com.timtro.modules.listing.model;

import com.timtro.core.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

@Getter
@Setter
@Entity
@Table(name = "universities")
public class University extends BaseEntity {

    @Column(name = "district_id")
    private Integer districtId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String slug;

    @Column(columnDefinition = "TEXT")
    private String address;

    @Column(name = "location_point", columnDefinition = "POINT SRID 4326")
    private Point locationPoint;
}
