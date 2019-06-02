package kz.kakimzhanova.book.action;

import kz.kakimzhanova.book.entity.Library;

public interface BookFinder {
    Library writtenBy(Library bookArr, String author);
    Library publishedBy(Library bookArr, String publisher);
    Library publishedSince(Library bookArr, int year);
}
