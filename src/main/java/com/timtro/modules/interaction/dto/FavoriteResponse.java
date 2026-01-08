package com.timtro.modules.interaction.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Response DTO cho Favorite (phòng đã lưu).
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FavoriteResponse {

    private Long roomId;
    private String roomTitle;
    private String roomSlug;
    private String roomThumbnail;
    private String roomPrice;
    private String roomArea;
    private String districtName;
    private String roomStatus;
    private LocalDateTime savedAt;
}
