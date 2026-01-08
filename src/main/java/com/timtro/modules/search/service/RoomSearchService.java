package com.timtro.modules.search.service;

import com.timtro.modules.search.dto.*;

/**
 * Service interface cho Room search operations.
 * Follows Interface Segregation Principle - chỉ xử lý search.
 * 
 * Chức năng chính:
 * 1. Tìm kiếm full-text
 * 2. Tìm kiếm theo geo (vị trí)
 * 3. Tìm kiếm gần trường đại học
 * 4. Autocomplete/Suggestions
 * 5. Tìm kiếm tương tự (more like this)
 */
public interface RoomSearchService {

    /** Tìm kiếm với nhiều tiêu chí */
    SearchResponse search(RoomSearchRequest request);

    /** Tìm kiếm theo geo - gần vị trí */
    SearchResponse searchNearby(Double latitude, Double longitude, Double radiusKm, RoomSearchRequest request);

    /** Tìm kiếm gần trường đại học */
    SearchResponse searchNearUniversity(Long universityId, Double radiusKm, RoomSearchRequest request);

    /** Autocomplete suggestions */
    AutocompleteResponse autocomplete(String query, Integer limit);

    /** Tìm phòng tương tự */
    SearchResponse findSimilar(Long roomId, Integer limit);

    /** Lấy phòng phổ biến/trending */
    SearchResponse getPopularRooms(Integer districtId, Integer limit);

    /** Lấy phòng mới đăng */
    SearchResponse getRecentRooms(Integer districtId, Integer limit);
}
