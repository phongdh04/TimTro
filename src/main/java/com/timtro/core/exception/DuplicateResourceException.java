package com.timtro.core.exception;

/**
 * Exception for duplicate resource scenarios.
 * Example: Username/phone already exists, room already favorited, etc.
 */
public class DuplicateResourceException extends BusinessException {

    public DuplicateResourceException(String message) {
        super(message);
    }

    public DuplicateResourceException(String resource, String field, String value) {
        super(String.format("%s with %s '%s' already exists", resource, field, value));
    }
}
