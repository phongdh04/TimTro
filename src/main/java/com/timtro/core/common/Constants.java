package com.timtro.core.common;

/**
 * Application-wide constants.
 */
public final class Constants {

    private Constants() {
        // Utility class, prevent instantiation
    }

    // ========================================
    // API Versioning
    // ========================================
    public static final String API_V1 = "/v1";

    // ========================================
    // Pagination Defaults
    // ========================================
    public static final int DEFAULT_PAGE_SIZE = 20;
    public static final int MAX_PAGE_SIZE = 100;

    // ========================================
    // Cache TTL (seconds)
    // ========================================
    public static final long CACHE_TTL_SHORT = 60; // 1 minute
    public static final long CACHE_TTL_MEDIUM = 300; // 5 minutes
    public static final long CACHE_TTL_LONG = 3600; // 1 hour
    public static final long CACHE_TTL_DAY = 86400; // 1 day

    // ========================================
    // Room Status
    // ========================================
    public static final String ROOM_STATUS_ACTIVE = "active";
    public static final String ROOM_STATUS_RENTED = "rented";
    public static final String ROOM_STATUS_EXPIRED = "expired";
    public static final String ROOM_STATUS_HIDDEN = "hidden";

    // ========================================
    // Room Categories
    // ========================================
    public static final String CATEGORY_STUDIO = "studio";
    public static final String CATEGORY_KHEP_KIN = "khep_kin";
    public static final String CATEGORY_CHUNG_CHU = "chung_chu";
    public static final String CATEGORY_NGUYEN_CAN = "nguyen_can";

    // ========================================
    // User Roles
    // ========================================
    public static final String ROLE_STUDENT = "student";
    public static final String ROLE_LANDLORD = "landlord";
    public static final String ROLE_ADMIN = "admin";

    // ========================================
    // Transaction Types
    // ========================================
    public static final String TRANSACTION_DEPOSIT = "deposit";
    public static final String TRANSACTION_WITHDRAW = "withdraw";
    public static final String TRANSACTION_BUY_PACKAGE = "buy_package";
    public static final String TRANSACTION_PUSH_FEE = "push_fee";
    public static final String TRANSACTION_REFUND = "refund";

    // ========================================
    // Transaction Status
    // ========================================
    public static final String TRANSACTION_PENDING = "pending";
    public static final String TRANSACTION_SUCCESS = "success";
    public static final String TRANSACTION_FAILED = "failed";

    // ========================================
    // Report Reasons
    // ========================================
    public static final String REPORT_SCAM = "scam";
    public static final String REPORT_WRONG_PRICE = "wrong_price";
    public static final String REPORT_DUPLICATE = "duplicate";
    public static final String REPORT_INAPPROPRIATE = "inappropriate";
    public static final String REPORT_OTHER = "other";

    // ========================================
    // Message Types
    // ========================================
    public static final String MESSAGE_TEXT = "text";
    public static final String MESSAGE_IMAGE = "image";
    public static final String MESSAGE_LOCATION = "location";

    // ========================================
    // Geo Constants
    // ========================================
    public static final double DEFAULT_SEARCH_RADIUS_KM = 3.0;
    public static final double MAX_SEARCH_RADIUS_KM = 50.0;
}
