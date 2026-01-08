package com.timtro.modules.search.repository;

import com.timtro.modules.search.document.RoomDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Elasticsearch repository cho RoomDocument.
 */
@Repository
public interface RoomSearchRepository extends ElasticsearchRepository<RoomDocument, Long> {

    /** Tìm theo district */
    List<RoomDocument> findByDistrictId(Integer districtId);

    /** Tìm theo landlord */
    List<RoomDocument> findByLandlordId(Long landlordId);

    /** Tìm theo category */
    List<RoomDocument> findByCategory(String category);

    /** Tìm theo status */
    List<RoomDocument> findByStatus(String status);

    /** Xóa theo room ID */
    void deleteById(Long id);
}
