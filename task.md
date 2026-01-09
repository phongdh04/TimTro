# Bảng Nhiệm Vụ Agile: Dự Án Tìm Trọ (TimTro)

Quy ước độ ưu tiên:
- **[P1 - Blocker]**: Không làm không chạy được.
- **[P2 - Critical]**: Tính năng chính.
- **[P3 - Major]**: Tính năng phụ.
- **[P4 - Minor]**: Nice-to-have.

## Sprint 1: Nền Tảng & Xác Thực (Users & Security)
**Mục tiêu**: Xây dựng Core Framework chắc chắn và luồng đăng nhập/đăng ký hoàn chỉnh.

### 1. Hạ tầng & Cấu hình (Infrastructure)
- [x] **[P1] Database & Docker**
    - [x] *Nghiên cứu*:
        - Cấu trúc file `docker-compose.yml` (services, ports, volumes).
        - Cách kết nối JDBC URL: `jdbc:mysql://localhost:3306/...`.
    - [x] **Thực hiện**:
        - Kiểm tra file `docker-compose.yml`: verified MySQL 8.0 & Redis 6.2.
        - Chạy lệnh `docker-compose up -d`.
        - Kết nối thử Database bằng DBeaver (User: root/password).

- [x] **[P1] Redis Configuration**
    - [x] *Nghiên cứu*:
        - `LettuceConnectionFactory` trong Spring Boot.
        - Sự khác biệt giữa `RedisTemplate<K, V>` và `StringRedisTemplate`.
    - [x] **Thực hiện**:
        - Review `RedisConfig.java`: Config host/port từ `application.properties`.
        - Viết hàm test kết nối Redis đơn giản (ping).

- [x] **[P2] Swagger/OpenAPI**
    - [x] *Nghiên cứu*:
        - OpenAPI 3.0 specification.
        - Annotation `@SecurityScheme` để bật nút "Authorize" (Bearer Token).
    - [x] **Thực hiện**:
        - Cấu hình `OpenApiConfig.java` để hỗ trợ Security JWT.
        - Verify truy cập `http://localhost:8080/swagger-ui.html`.

### 2. Module Người dùng (Users Backend)
- [ ] **[P1] JPA Entity `User`**
    - [ ] *Nghiên cứu*:
        - JPA Annotations: `@Entity`, `@Table`, `@Column`, `@Id`, `@GeneratedValue`.
        - Bean Validation: `@Email`, `@NotBlank`, `@Size`.
        - JPA Auditing: `@CreatedDate`, `@LastModifiedDate`, `@EntityListeners`.
    - [ ] **Thực hiện**:
        - Thêm validation cho field `email` (must be valid email), `password` (min 6 chars).
        - Kế thừa `BaseEntity` để có `createdAt`, `updatedAt`.
        - Tạo Enum `Role` (USER, ADMIN, LANDLORD) và map vào Entity dạng `@Enumerated(EnumType.STRING)`.

- [ ] **[P1] Repository Layer**
    - [ ] *Nghiên cứu*:
        - Spring Data JPA Query Methods (quy tắc đặt tên hàm `findBy...`).
        - `Optional<T>` trong Java 8 để tránh NullPointerException.
    - [ ] **Thực hiện**:
        - `UserRepository`: Viết `Optional<User> findByEmail(String email)`.
        - `UserRepository`: Viết `boolean existsByEmail(String email)` (dùng cho validate register).
        - `UserRepository`: Viết `boolean existsByPhone(String phone)`.

- [ ] **[P1] Service Layer (`AuthService`)**
    - [ ] *Nghiên cứu*:
        - `BCryptPasswordEncoder`: Cơ chế hash salt (không lưu plain text password).
        - Dependency Injection: `@Service`, `@RequiredArgsConstructor`.
    - [ ] **Thực hiện**:
        - **Hàm Register**:
            1. Check `existsByEmail` -> ném lỗi nếu trùng.
            2. `passwordEncoder.encode(rawPassword)`.
            3. `userRepository.save(newUser)`.
        - **Hàm Login**:
            1. `userRepository.findByEmail` -> ném lỗi nếu không tìm thấy.
            2. `passwordEncoder.matches(raw, hashed)` -> ném lỗi nếu sai pass.
            3. Gọi `JwtTokenProvider` để tạo token.

### 3. Tích hợp Bảo mật (Spring Security)
- [ ] **[P1] JWT Utilities (`JwtTokenProvider`)**
    - [ ] *Nghiên cứu*:
        - Cấu trúc JWT: Header.Payload.Signature.
        - Thư viện `io.jsonwebtoken` (JJWT).
        - Khái niệm `Claims`, `Expiration`, `SignWith (HS256)`.
    - [ ] **Thực hiện**:
        - Viết `generateToken(UserDetails)`: Set subject=email, roles, expired=1 day.
        - Viết `validateToken(String token)`: Try-catch `ExpiredJwtException`, `MalformedJwtException`.

- [ ] **[P1] Security Configuration**
    - [ ] *Nghiên cứu*:
        - `SecurityFilterChain` (thay thế `WebSecurityConfigurerAdapter` đã deprecated).
        - `SessionCreationPolicy.STATELESS`: Tại sao API không cần session?
        - CSRF: Tại sao disable khi dùng JWT?
    - [ ] **Thực hiện**:
        - Config `SecurityConfig`: Disable CSRF, Set Stateless.
        - Phân quyền: `/api/v1/auth/**` -> permitAll().
        - Đăng ký `JwtAuthenticationFilter` vào chuỗi filter.

- [ ] **[P1] Authentication Filter**
    - [ ] *Nghiên cứu*:
        - `OncePerRequestFilter`: Đảm bảo filter chỉ chạy 1 lần per request.
        - `SecurityContextHolder`: Nơi lưu trữ thông tin User hiện tại của Request.
    - [ ] **Thực hiện**:
        - Implement `doFilterInternal`:
            1. Lấy header `Authorization`.
            2. Check prefix "Bearer ".
            3. `jwtTokenProvider.validateToken()`.
            4. `SecurityContextHolder.getContext().setAuthentication(...)`.

## Sprint 2: Nghiệp vụ Cốt lõi (Phòng & Nhà trọ)
**Mục tiêu**: API CRUD cho bài đăng.

- [ ] **Database Design (`BoardingHouse`, `Room`)**
    - [ ] *Nghiên cứu*: Hibernate Relationships `@OneToMany`, `@ManyToOne`, `CascadeType`, `FetchType.LAZY`.
    - [ ] **Thực hiện**:
        - Tạo Entity `BoardingHouse`: name, address, description.
        - Tạo Entity `Room`: price, area, status. Relation N-1 với BoardingHouse.

- [ ] **File Upload**
    - [ ] *Nghiên cứu*: `MultipartFile` interface, Cloudinary API integration.
    - [ ] **Thực hiện**: Viết Service upload ảnh, return URL string.

## Sprint 3, 4, 5 (Chi tiết sau khi hoàn thành Sprint 1&2)
- [ ] Tìm kiếm (Specification, Indexing).
- [ ] Realtime (WebSocket STOMP).
- [ ] Payment (VNPay IPN).
