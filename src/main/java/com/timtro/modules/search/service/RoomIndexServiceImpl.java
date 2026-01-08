package com.timtro.modules.search.service;

import com.timtro.modules.search.document.RoomDocument;
import com.timtro.modules.search.repository.RoomSearchRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class RoomIndexServiceImpl implements RoomIndexService {

    private final RoomSearchRepository roomSearchRepository;
    private final ElasticsearchOperations elasticsearchOperations;
    // TODO: Inject RoomRepository từ listing module để reindex

    @Override
    public void indexRoom(RoomDocument document) {
        // TODO: Implement
        // Save document to Elasticsearch
        log.info("Indexing room: {}", document.getId());
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void updateRoom(RoomDocument document) {
        // TODO: Implement
        // Update document in Elasticsearch
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void deleteRoom(Long roomId) {
        // TODO: Implement
        // Delete document from Elasticsearch
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void bulkIndex(List<RoomDocument> documents) {
        // TODO: Implement
        // Bulk save for performance
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void reindexAll() {
        // TODO: Implement
        // 1. Delete all documents
        // 2. Fetch all rooms from database
        // 3. Convert to RoomDocument
        // 4. Bulk index
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void updatePartial(Long roomId, Map<String, Object> fields) {
        // TODO: Implement
        // Partial update without reindexing full document
        // Useful for updating viewCount, saveCount frequently
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
