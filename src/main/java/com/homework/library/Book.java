package com.homework.library;

import java.util.ArrayList;

public class Book {
    private final String isbn;
    private final String title;
    private final String subtitle;
    private final String publisher;
    private final long publishedDate;
    private final String description;
    private final int pageCount;
    private final String thumbnailUrl;
    private final String language;
    private final String previewLink;
    private final double averageRating;
    private final ArrayList<String> authors;
    private final ArrayList<String> categories;

    public Book(final String isbn,
                final String title,
                final String subtitle,
                final String publisher,
                final long publishedDate,
                final String description,
                final int pageCount,
                final String thumbnailUrl,
                final String language,
                final String previewLink,
                final double averageRating,
                final ArrayList<String> authors,
                final ArrayList<String> categories) {
        this.isbn = isbn;
        this.title = title;
        this.subtitle = subtitle;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.description = description;
        this.pageCount = pageCount;
        this.thumbnailUrl = thumbnailUrl;
        this.language = language;
        this.previewLink = previewLink;
        this.averageRating = averageRating;
        this.authors = authors;
        this.categories = categories;
    }
}
