package kz.kakimzhanova.book.entity;

import kz.kakimzhanova.book.util.IdGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private long libraryId;
    private List<Book> books;

    public Library(){
        this.libraryId = IdGenerator.generateLibraryId();
        books = new ArrayList<>();
    }

    public List<Book> getBooks(){
        return Collections.unmodifiableList(books);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("Library id: ");
        s.append(libraryId);
        s.append("\n");
        if (books != null){
            for (Book book : books){
                s.append(book);
            }
        }
        return s.toString();
    }
}
