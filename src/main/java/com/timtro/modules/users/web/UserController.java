package com.timtro.modules.users.web;

import com.timtro.core.base.BaseController;
import com.timtro.core.common.ApiResponse;
import com.timtro.modules.users.dto.UserResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@Tag(name = "Users", description = "Quản lý thông tin cá nhân")
public class UserController extends BaseController {

    @Operation(summary = "Xem hồ sơ cá nhân")
    @GetMapping("/me")
    public ResponseEntity<ApiResponse<UserResponse>> getMyProfile() {
        // Architecture Skeleton Only - No Logic
        return null;
    }

    @Operation(summary = "Cập nhật hồ sơ")
    @PutMapping("/me")
    public ResponseEntity<ApiResponse<UserResponse>> updateProfile() {
        // Architecture Skeleton Only - No Logic
        return null;
    }

    @Operation(summary = "Đổi mật khẩu")
    @PostMapping("/change-password")
    public ResponseEntity<ApiResponse<Void>> changePassword() {
        // Architecture Skeleton Only - No Logic
        return null;
    }
}
