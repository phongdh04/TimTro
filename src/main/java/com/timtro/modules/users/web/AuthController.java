package com.timtro.modules.users.web;

import com.timtro.core.base.BaseController;
import com.timtro.core.common.ApiResponse;
import com.timtro.modules.users.dto.AuthResponse;
import com.timtro.modules.users.dto.LoginRequest;
import com.timtro.modules.users.dto.RegisterRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@Tag(name = "Authentication", description = "Đăng ký, Đăng nhập, Refresh Token")
public class AuthController extends BaseController {

    @Operation(summary = "Đăng ký tài khoản mới (Student/Landlord)")
    @PostMapping("/register")
    public ResponseEntity<ApiResponse<AuthResponse>> register(@Valid @RequestBody RegisterRequest request) {
        // Architecture Skeleton Only - No Logic
        return null;
    }

    @Operation(summary = "Đăng nhập")
    @PostMapping("/login")
    public ResponseEntity<ApiResponse<AuthResponse>> login(@Valid @RequestBody LoginRequest request) {
        // Architecture Skeleton Only - No Logic
        return null;
    }

    @Operation(summary = "Làm mới Token")
    @PostMapping("/refresh-token")
    public ResponseEntity<ApiResponse<AuthResponse>> refreshToken() {
        // Architecture Skeleton Only - No Logic
        return null;
    }
}
