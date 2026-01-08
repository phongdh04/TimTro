# TimTro API - Student Accommodation Finder

Hệ thống tìm trọ sinh viên với kiến trúc **Modular Monolith**, sẵn sàng scale lên **Microservices**.

## 🏗️ Kiến Trúc

```
com.timtro
├── core/                      # Shared Kernel
│   ├── common/                # BaseEntity, ApiResponse
│   ├── config/                # Security, Redis, etc.
│   ├── event/                 # Domain Events
│   └── exception/             # Global Exception Handler
│
├── modules/
│   ├── users/                 # [Module Users]
│   │   ├── web/               # Controllers
│   │   ├── dto/               # Request/Response DTOs
│   │   ├── service/           # Business Logic
│   │   ├── repository/        # JPA Repositories
│   │   └── model/             # Entities
│   │
│   ├── listing/               # [Module Listing]
│   │   ├── web/
│   │   ├── dto/
│   │   ├── service/
│   │   ├── repository/
│   │   ├── model/
│   │   └── event/             # Domain Events
│   │
│   ├── search/                # [Module Search - Elasticsearch]
│   │   ├── listener/          # Event Listeners
│   │   └── service/
│   │
│   └── payment/               # [Module Payment]
│
└── TimTroApplication.java
```

## 🚀 Quick Start

### 1. Khởi động Infrastructure (Docker)

```bash
docker-compose up -d
```

Các services sẽ chạy:
- **MySQL**: `localhost:3307`
- **Redis**: `localhost:6379`
- **Elasticsearch**: `localhost:9200`
- **Kibana**: `localhost:5601`

### 2. Chạy ứng dụng Spring Boot

```bash
mvn spring-boot:run
```

Hoặc từ IDE (IntelliJ/VSCode).

### 3. Truy cập

- **API**: http://localhost:8080/api
- **Swagger UI**: http://localhost:8080/api/swagger-ui.html
- **Kibana**: http://localhost:5601

## 📦 Tech Stack

| Component | Technology |
|-----------|------------|
| Backend | Spring Boot 3.2 |
| Database | MySQL 8.0 |
| Cache | Redis 7 |
| Search | Elasticsearch 8.x |
| ORM | Hibernate + Hibernate Spatial |
| Security | Spring Security + JWT |
| Mapper | MapStruct |
| Docs | OpenAPI/Swagger |

## 🔗 Event-Driven Communication

```
┌─────────────┐     Event      ┌─────────────┐
│   Listing   │ ──────────────▶│   Search    │
│   Module    │ ListingCreated │   Module    │
└─────────────┘                └─────────────┘
       │                              │
       ▼                              ▼
    MySQL                       Elasticsearch
```

Các module giao tiếp qua **Spring Events** để tránh Circular Dependency.

## 🛠️ Development

### Database

Schema đã có sẵn trong `timTro.sql`. Docker sẽ tự động import khi khởi động.

### Thêm Entity mới

1. Tạo Entity trong `modules/<module>/model/`
2. Kế thừa `BaseEntity` để có auditing tự động
3. Tạo Repository interface
4. Tạo Service interface + Implementation
5. Tạo DTO trong `dto/`
6. Tạo Controller trong `web/`

## 📝 License

MIT
