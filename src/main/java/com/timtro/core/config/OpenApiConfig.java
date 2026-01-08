package com.timtro.core.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * OpenAPI/Swagger Configuration.
 * API documentation available at /swagger-ui.html
 */
@Configuration
public class OpenApiConfig {

    @Value("${spring.application.name:TimTro API}")
    private String applicationName;

    @Bean
    public OpenAPI customOpenAPI() {
        final String securitySchemeName = "bearerAuth";

        return new OpenAPI()
                .info(new Info()
                        .title(applicationName)
                        .version("1.0.0")
                        .description("""
                                TimTro - Ứng dụng tìm phòng trọ cho sinh viên.

                                ## Modules:
                                - **Users**: Quản lý tài khoản, xác thực
                                - **Listing**: Quản lý phòng trọ, nhà trọ
                                - **Chat**: Nhắn tin giữa sinh viên và chủ trọ
                                - **Interaction**: Yêu thích, đánh giá, báo cáo
                                - **Payment**: Ví điện tử, gói dịch vụ
                                - **Search**: Tìm kiếm với Elasticsearch
                                """)
                        .contact(new Contact()
                                .name("TimTro Team")
                                .email("support@timtro.vn")
                                .url("https://timtro.vn"))
                        .license(new License()
                                .name("Private")
                                .url("https://timtro.vn/license")))
                .servers(List.of(
                        new Server().url("http://localhost:8080").description("Development"),
                        new Server().url("https://api.timtro.vn").description("Production")))
                .addSecurityItem(new SecurityRequirement().addList(securitySchemeName))
                .components(new Components()
                        .addSecuritySchemes(securitySchemeName, new SecurityScheme()
                                .name(securitySchemeName)
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT")
                                .description("JWT token. Get from /v1/auth/login")));
    }
}
