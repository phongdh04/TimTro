package com.timtro.modules.search.service;

import com.timtro.modules.search.document.RoomDocument;

/**
 * Service interface cho Elasticsearch indexing operations.
 * Follows Interface Segregation Principle - chỉ xử lý indexing.
 * 
 * Chức năng chính:
 * 1. Index room mới
 * 2. Cập nhật room
 * 3. Xóa room khỏi index
 * 4. Bulk index
 * 5. Reindex toàn bộ
 */
public interface RoomIndexService {

    /** Index 1 room */
    void indexRoom(RoomDocument document);

    /** Cập nhật room trong index */
    void updateRoom(RoomDocument document);

    /** Xóa room khỏi index */
    void deleteRoom(Long roomId);

    /** Bulk index nhiều rooms */
    void bulkIndex(java.util.List<RoomDocument> documents);

    /** Reindex toàn bộ từ database */
    void reindexAll();

    /** Cập nhật partial fields (view count, save count, etc.) */
    void updatePartial(Long roomId, java.util.Map<String, Object> fields);
}
