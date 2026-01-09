package com.timtro.core.base;

import com.timtro.core.common.ApiResponse;
import org.springframework.http.ResponseEntity;

/**
 * Base Controller class that provides standardized response methods.
 * All controllers should extend this class to ensure consistent API responses.
 */
public abstract class BaseController {

    protected <T> ResponseEntity<ApiResponse<T>> success(T data) {
        return ResponseEntity.ok(ApiResponse.success(data));
    }

    protected <T> ResponseEntity<ApiResponse<T>> success(String message, T data) {
        return ResponseEntity.ok(ApiResponse.success(message, data));
    }

    protected <T> ResponseEntity<ApiResponse<T>> created(T data) {
        return ResponseEntity.status(201).body(ApiResponse.created(data));
    }
}
