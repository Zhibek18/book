package kz.kakimzhanova.book.action;

import kz.kakimzhanova.book.entity.Book;
import kz.kakimzhanova.book.entity.Library;

public class BookFinderImpl implements BookFinder{
    public Library writtenBy(Library bookArr, String author){
        Library authorBooks = new Library();
        for (Book book : bookArr.getBooks()){
            for (String bookAuthor : book.getAuthors()){
                if (bookAuthor.equals(author)){
                    authorBooks.addBook(book);
                }
            }
        }
        return authorBooks;
    }

    public Library publishedBy(Library bookArr, String publisher){
        Library publisherBooks = new Library();
        for (Book book : bookArr.getBooks()){
            if (book.getPublishingHouse().equals(publisher)){
                publisherBooks.addBook(book);
            }
        }
        return publisherBooks;
    }

    public Library publishedSince(Library bookArr, int year){
        Library yearBooks = new Library();
        for (Book book : bookArr.getBooks()){
            if (book.getPublishingYear() > year){
                yearBooks.addBook(book);
            }
        }
        return yearBooks;
    }
}
