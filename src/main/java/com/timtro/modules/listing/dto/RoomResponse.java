package com.timtro.modules.listing.dto;

import lombok.Data;

@Data
public class RoomResponse {
    private Long id;
    private String title;
    private Double price;
    private String address;
}
