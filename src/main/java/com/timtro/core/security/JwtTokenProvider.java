package com.timtro.core.security;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

/**
 * JWT Token Provider.
 * Responsible for generating and validating JWT tokens.
 */
@Component
public class JwtTokenProvider {

    public String generateToken(Authentication authentication) {
        // TODO: Implement token generation
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public String generateTokenFromUsername(String username) {
        // TODO: Implement token generation
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean validateJwtToken(String authToken) {
        // TODO: Implement token validation
        return false;
    }

    public String getUsernameFromJwtToken(String token) {
        // TODO: Implement extract username
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
