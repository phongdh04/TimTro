package com.timtro.modules.users.web;

import com.timtro.core.base.BaseController;
import com.timtro.core.common.ApiResponse;
import com.timtro.modules.users.dto.UserResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin/users")
@Tag(name = "Admin - Users", description = "Quản lý người dùng (Dành cho Admin)")
public class AdminController extends BaseController {

    @Operation(summary = "Lấy danh sách người dùng")
    @GetMapping
    public ResponseEntity<ApiResponse<List<UserResponse>>> getAllUsers() {
        // Architecture Skeleton Only - No Logic
        return null;
    }

    @Operation(summary = "Khóa tài khoản người dùng")
    @PostMapping("/{userId}/block")
    public ResponseEntity<ApiResponse<Void>> blockUser(@PathVariable Long userId) {
        // Architecture Skeleton Only - No Logic
        return null;
    }

    @Operation(summary = "Mở khóa tài khoản")
    @PostMapping("/{userId}/unblock")
    public ResponseEntity<ApiResponse<Void>> unblockUser(@PathVariable Long userId) {
        // Architecture Skeleton Only - No Logic
        return null;
    }
}
