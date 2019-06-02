package kz.kakimzhanova.book.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<Book>();

    public Library(){

    }

    public void addBook(Book book) {
        books.add(book);
    }
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        if (books != null){
            for (Book book : books){
                s.append(book);
            }
        }
        return s.toString();
    }

    public List<Book> getBooks(){
        return Collections.unmodifiableList(books);
    }
}
