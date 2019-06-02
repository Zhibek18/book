package kz.kakimzhanova.book.main;

import kz.kakimzhanova.book.action.LibraryAction;
import kz.kakimzhanova.book.entity.Book;
import kz.kakimzhanova.book.entity.Library;

public class Main {
    public static void main(String[] args) {
        String[] authors = {"А.Н.Стругацкий","Б.Н.Стругацкий"};
        Book myBook = new Book("Жук в муравейнике", authors, "Текст", 1991, 428, 15, "Твердый");
        Book yourBook = new Book("Анна Каренина", "Л.Н.Толстой", "АСТ", 2016, 864, 990, "Мягкий");
        Book hisBook = new Book("Война и мир", "Л.Н.Толстой", "АСТ", 1981, 1084, 1060, "Твердый");
        Library ourBooks = new Library();

        ourBooks.addBook(myBook);
        ourBooks.addBook(yourBook);
        ourBooks.addBook(hisBook);
        LibraryAction libraryAction = new LibraryAction();
        System.out.println("writtenBy:\n" + libraryAction.writtenBy(ourBooks, "Л.Н.Толстой"));
        System.out.println("publishedBy:\n" + libraryAction.publishedBy(ourBooks, "АСТ"));
        System.out.println("publishedSince:\n" + libraryAction.publishedSince(ourBooks, 2000));
    }
}
