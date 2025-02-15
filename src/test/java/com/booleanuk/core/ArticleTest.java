package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArticleTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Author author1 = new Author("name", "email@gamil.com", "website.com");

        Article article = new Article("JUnit Rocks", author1);
        Assertions.assertEquals("item has been checked out", article.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Author author1 = new Author("name", "email@gamil.com", "website.com");

        Article article = new Article("JUnit Rocks", author1);
        article.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Author author1 = new Author("name", "email@gamil.com", "website.com");

        Article article = new Article("JUnit Rocks", author1);
        article.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Author author1 = new Author("name", "email@gamil.com", "website.com");

        Article article = new Article("JUnit Rocks", author1);

        Assertions.assertEquals("item is not currently on loan", article.checkIn());
    }
}
