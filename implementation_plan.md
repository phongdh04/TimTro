# Sprint 1: Nền Tảng & Xác Thực (Users & Security)

## Mô tả Mục tiêu
Xây dựng hệ thống xác thực bảo mật và mạnh mẽ sử dụng Spring Security và JWT. Đây là nền tảng cho mọi tương tác người dùng (Chủ trọ, Người thuê, Admin) và bảo vệ các API endpoints. Chúng ta cũng sẽ hoàn thiện Entity `User` và Repository.

## Yêu cầu Người dùng Review
> [!IMPORTANT]
> - Xác nhận chiến lược phân quyền (Role-based access control): ví dụ `ROLE_USER`, `ROLE_ADMIN`, `ROLE_LANDLORD`.
> - Review các trường trong Entity `User` (ví dụ: `is_verified` (đã xác thực email?), `provider` cho OAuth2 sau này).

## Các Thay đổi Đề xuất

### Module Users
#### [SỬA] [User.java](file:///d:/codeTimTro/src/main/java/com/timtro/modules/users/model/User.java)
- Đảm bảo có các trường: `email`, `password`, `fullName`, `phone`, `role`, `status`.
- Thêm annotation validation (`@NotNull`, `@Email`...).

#### [SỬA] [UserRepository.java](file:///d:/codeTimTro/src/main/java/com/timtro/modules/users/repository/UserRepository.java)
- Thêm `Optional<User> findByEmail(String email);`
- Thêm `boolean existsByEmail(String email);`
- Thêm `boolean existsByPhone(String phone);` (Sửa lỗi cũ).

#### [MỚI] [AuthService.java](file:///d:/codeTimTro/src/main/java/com/timtro/modules/users/service/AuthService.java)
- Logic cho `register` (đăng ký), `login` (đăng nhập).
- Mã hóa mật khẩu dùng `BCryptPasswordEncoder`.
- Sinh JWT Token dùng `JwtTokenProvider`.

#### [MỚI] [AuthController.java](file:///d:/codeTimTro/src/main/java/com/timtro/modules/users/web/AuthController.java)
- Các Endpoints:
  - `POST /api/v1/auth/register`
  - `POST /api/v1/auth/login`
  - `POST /api/v1/auth/refresh-token`

### Module Core (Security)
#### [SỬA] [SecurityConfig.java](file:///d:/codeTimTro/src/main/java/com/timtro/core/config/SecurityConfig.java)
- Cấu hình `SecurityFilterChain`.
- Tắt CSRF (vì dùng stateless API).
- Cấu hình `SessionManagement` thành STATELESS.
- Thêm `JwtAuthenticationFilter` vào trước `UsernamePasswordAuthenticationFilter`.

#### [SỬA] [JwtAuthenticationFilter.java](file:///d:/codeTimTro/src/main/java/com/timtro/core/security/JwtAuthenticationFilter.java)
- Implement `doFilterInternal` để lấy token từ header `Authorization`.
- Validate token và set thông tin user vào `SecurityContext`.

#### [SỬA] [JwtTokenProvider.java](file:///d:/codeTimTro/src/main/java/com/timtro/core/security/JwtTokenProvider.java)
- Implement `generateToken`, `validateToken`, `getEmailFromToken`.

## Kế hoạch Kiểm thử (Verification Plan)

### Kiểm thử Tự động (Automated Tests)
- Tạo `AuthServiceTest` (JUnit + Mockito) để kiểm tra logic nghiệp vụ.
- Tạo `AuthControllerTest` (MockMvc) để kiểm tra API contract.
- **Lệnh chạy**: `mvn test -Dtest=AuthServiceTest,AuthControllerTest`

### Kiểm thử Thủ công (Manual Verification)
- **Công cụ**: Postman hoặc Swagger UI (`http://localhost:8080/swagger-ui.html`)
- **Kịch bản**:
    1. **Đăng ký**: Gửi POST `/register` -> Mong đợi 200 OK & User được tạo trong DB.
    2. **Đăng nhập**: Gửi POST `/login` đúng info -> Mong đợi trả về JWT Token.
    3. **Đăng nhập sai**: Gửi POST `/login` sai pass -> Mong đợi 401 Unauthorized.
    4. **API Bảo vệ**: Gọi API yêu cầu quyền (ví dụ `/api/v1/users/me`) không kèm token -> Mong đợi 403/401.

## Sprint 1.5: Hoàn thiện Role & Access Control
> [!IMPORTANT]
> Đây là bước quan trọng để đảm bảo logic phân quyền hoạt động trước khi làm các tính năng nghiệp vụ.

### Các Thay đổi Đề xuất

#### 1. DTO & Validation
- **[RegisterRequest.java]**: Field `role` đang là String. Cần validate trong Service để đảm bảo chỉ nhận giá trị hợp lệ (STUDENT, LANDLORD). ADMIN không được đăng ký public.

#### 2. Logic Xác thực (Auth)
- **[MỚI] [AuthServiceImpl.java](file:///d:/codeTimTro/src/main/java/com/timtro/modules/users/service/AuthServiceImpl.java)**
    - Implement `register`: 
        - Convert String role -> Enum Role.
        - Nếu role gửi lên là ADMIN -> Throw Exception (Forbidden).
        - Hash password.
        - Save User.
    - Implement `login`:
        - Verify password.
        - Generate Token chứa Claim `role`.

- **[MỚI] [AuthController.java](file:///d:/codeTimTro/src/main/java/com/timtro/modules/users/web/AuthController.java)**
    - `POST /register`: Cho phép đăng ký STUDENT, LANDLORD.
    - `POST /login`: Trả về Token.

#### 3. Security Configuration
- **[SỬA] [SecurityConfig.java](file:///d:/codeTimTro/src/main/java/com/timtro/core/config/SecurityConfig.java)**
    - Phân quyền cụ thể:
        - `/api/v1/auth/**` -> permitAll.
        - `/api/v1/admin/**` -> hasRole('ADMIN').
        - `/api/v1/landlords/**` -> hasRole('LANDLORD').
        - Các API khác -> authenticated().

#### 4. Data Seeding
- **[MỚI] [DataSeeder.java](file:///d:/codeTimTro/src/main/java/com/timtro/core/config/DataSeeder.java)**
    - Kiểm tra nếu DB chưa có users -> Tạo 1 tài khoản Admin mặc định (`admin@timtro.com` / `admin123`).

## Kế hoạch Kiểm thử (Verification Plan)

### Automated Tests
- **[MỚI] AuthIntegrationTest.java**:
    - `testStudentRegister()`: Gửi role STUDENT -> Success.
    - `testAdminRegisterFail()`: Gửi role ADMIN -> Expect 403/400.
    - `testLogin()`: Login đúng -> Trả về Token hợp lệ.

### Manual Verification (Postman/Curl)
1. **Register Landlord**: `POST /api/v1/auth/register` với `role="LANDLORD"`. Check DB xem role đúng không.
2. **Access Admin API**: Dùng token Landlord gọi API Admin (nếu có) -> Expect 403 Forbidden.
3. **Login Admin**: Dùng tài khoản seed đăng nhập -> Success.
