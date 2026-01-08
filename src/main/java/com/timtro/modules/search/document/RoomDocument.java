package com.timtro.modules.search.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.*;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Elasticsearch document cho Room.
 * Được index từ Room entity qua event-driven sync.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "rooms")
@Setting(settingPath = "/elasticsearch/room-settings.json")
public class RoomDocument {

    @Id
    private Long id;

    @Field(type = FieldType.Text, analyzer = "vietnamese")
    private String title;

    @Field(type = FieldType.Keyword)
    private String slug;

    @Field(type = FieldType.Double)
    private BigDecimal price;

    @Field(type = FieldType.Double)
    private BigDecimal area;

    @Field(type = FieldType.Keyword)
    private String category; // studio, khep_kin, chung_chu, nguyen_can

    @Field(type = FieldType.Keyword)
    private String genderRestriction;

    @Field(type = FieldType.Keyword)
    private String status;

    // Location
    @Field(type = FieldType.Integer)
    private Integer districtId;

    @Field(type = FieldType.Keyword)
    private String districtName;

    @Field(type = FieldType.Text, analyzer = "vietnamese")
    private String address;

    @GeoPointField
    private GeoPoint location;

    // House info
    @Field(type = FieldType.Long)
    private Long houseId;

    @Field(type = FieldType.Text, analyzer = "vietnamese")
    private String houseName;

    @Field(type = FieldType.Object)
    private String amenities; // JSON

    // Landlord info
    @Field(type = FieldType.Long)
    private Long landlordId;

    @Field(type = FieldType.Keyword)
    private String landlordName;

    // Media
    @Field(type = FieldType.Keyword)
    private String thumbnailUrl;

    // Stats & ranking
    @Field(type = FieldType.Integer)
    private Integer viewCount;

    @Field(type = FieldType.Integer)
    private Integer saveCount;

    @Field(type = FieldType.Double)
    private Double avgRating;

    @Field(type = FieldType.Integer)
    private Integer priorityLevel;

    @Field(type = FieldType.Date, format = DateFormat.date_hour_minute_second)
    private LocalDateTime lastPushedAt;

    @Field(type = FieldType.Date, format = DateFormat.date_hour_minute_second)
    private LocalDateTime createdAt;

    // Nearby universities (for proximity search)
    @Field(type = FieldType.Nested)
    private java.util.List<NearbyUniversity> nearbyUniversities;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class NearbyUniversity {
        private Long universityId;
        private String universityName;
        private Double distanceKm;
    }
}
