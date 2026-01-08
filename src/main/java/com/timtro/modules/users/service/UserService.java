package com.timtro.modules.users.service;

import com.timtro.modules.users.dto.UserResponse;

/**
 * Service interface for User operations.
 * 
 * Chức năng chính:
 * 1. Lấy thông tin user theo ID
 * 2. Lấy thông tin user theo username
 * 3. Cập nhật thông tin user
 * 4. Thay đổi mật khẩu
 * 5. Cập nhật avatar
 */
public interface UserService {

    /** Lấy user theo ID */
    UserResponse getUserById(Long id);

    /** Lấy user theo username */
    UserResponse getUserByUsername(String username);

    /** Cập nhật thông tin profile */
    UserResponse updateUser(Long id, UserResponse request);

    /** Thay đổi mật khẩu */
    void changePassword(Long userId, String oldPassword, String newPassword);

    /** Cập nhật avatar */
    UserResponse updateAvatar(Long userId, String avatarUrl);
}
