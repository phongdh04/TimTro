package com.timtro.modules.listing.dto;

import lombok.Data;

@Data
public class RoomRequest {
    private String title;
    private Double price;
    private String description;
}
