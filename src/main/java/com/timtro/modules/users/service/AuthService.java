package com.timtro.modules.users.service;

import com.timtro.modules.users.dto.*;

/**
 * Service interface for Authentication operations.
 * 
 * Chức năng chính:
 * 1. Đăng ký tài khoản mới
 * 2. Đăng nhập (username/phone + password)
 * 3. Refresh token
 */
public interface AuthService {

    /** Đăng ký tài khoản mới */
    AuthResponse register(RegisterRequest request);

    /** Đăng nhập */
    AuthResponse login(LoginRequest request);

    /** Refresh access token */
    AuthResponse refreshToken(String refreshToken);
}
