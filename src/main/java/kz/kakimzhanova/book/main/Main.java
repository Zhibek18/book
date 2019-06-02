package kz.kakimzhanova.book.main;

import kz.kakimzhanova.book.entity.Book;
import kz.kakimzhanova.book.entity.Library;
import kz.kakimzhanova.book.report.Report;

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        String[] authors = {"А.Н.Стругацкий","Б.Н.Стругацкий"};
        Book myBook = new Book("Жук в муравейнике", authors, "Текст",
                                1991, 428, 15, "Твердый");
        Book yourBook = new Book("Анна Каренина", "Л.Н.Толстой", "АСТ",
                                2016, 864, 990, "Мягкий");
        Book hisBook = new Book("Война и мир", "Л.Н.Толстой", "АСТ",
                                1981, 1084, 1060, "Твердый");
        Library library = new Library();

        library.addBook(myBook);
        library.addBook(yourBook);
        library.addBook(hisBook);
        
        report.printReport(library);

    }
}
