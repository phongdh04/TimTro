package com.timtro.core.util;

import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Pattern;

/**
 * Utility class for generating URL-friendly slugs.
 */
public final class SlugUtils {

    private static final Pattern NONLATIN = Pattern.compile("[^\\w-]");
    private static final Pattern WHITESPACE = Pattern.compile("[\\s]");
    private static final Pattern MULTIDASH = Pattern.compile("-+");

    private SlugUtils() {
        // Utility class, prevent instantiation
    }

    /**
     * Generate a URL-friendly slug from a string.
     * Example: "Phòng trọ gần ĐH Bách Khoa" -> "phong-tro-gan-dh-bach-khoa"
     */
    public static String toSlug(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        // Convert to lowercase
        String result = input.toLowerCase(Locale.ROOT);

        // Remove Vietnamese accents
        result = removeVietnameseAccents(result);

        // Replace whitespace with dashes
        result = WHITESPACE.matcher(result).replaceAll("-");

        // Remove non-latin characters
        result = NONLATIN.matcher(result).replaceAll("");

        // Replace multiple dashes with single dash
        result = MULTIDASH.matcher(result).replaceAll("-");

        // Remove leading/trailing dashes
        result = result.replaceAll("^-|-$", "");

        return result;
    }

    /**
     * Generate a unique slug by appending a suffix.
     */
    public static String toUniqueSlug(String input, String suffix) {
        String baseSlug = toSlug(input);
        return baseSlug + "-" + suffix;
    }

    /**
     * Remove Vietnamese accents from a string.
     */
    public static String removeVietnameseAccents(String input) {
        if (input == null) {
            return null;
        }

        // Normalize to decomposed form (NFD)
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);

        // Remove combining diacritical marks
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        String result = pattern.matcher(normalized).replaceAll("");

        // Handle special Vietnamese characters
        result = result.replace('đ', 'd').replace('Đ', 'D');

        return result;
    }
}
