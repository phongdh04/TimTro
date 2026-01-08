package com.timtro.core.exception;

/**
 * Exception for unauthorized access attempts.
 * Thrown when a user tries to access a resource they don't own.
 */
public class UnauthorizedException extends RuntimeException {

    public UnauthorizedException(String message) {
        super(message);
    }

    public UnauthorizedException(String resource, Long resourceId, Long userId) {
        super(String.format("User %d is not authorized to access %s with id %d",
                userId, resource, resourceId));
    }
}
