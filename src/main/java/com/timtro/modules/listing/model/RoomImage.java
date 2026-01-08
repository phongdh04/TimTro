package com.timtro.modules.listing.model;

import com.timtro.core.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "room_images")
public class RoomImage extends BaseEntity {

    @Column(name = "room_id", nullable = false)
    private Long roomId;

    @Column(name = "image_url", nullable = false)
    private String imageUrl;

    @Column(name = "is_verified_image")
    private Boolean isVerifiedImage = false;
}
