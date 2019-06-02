package kz.kakimzhanova.book.report;

import kz.kakimzhanova.book.action.BookFinderImpl;
import kz.kakimzhanova.book.entity.Library;

public class Report {
    public static void printReport(Library library){

        BookFinderImpl libraryAction = new BookFinderImpl();
        System.out.println("writtenBy:\n" + libraryAction.writtenBy(library, "Л.Н.Толстой"));
        System.out.println("publishedBy:\n" + libraryAction.publishedBy(library, "АСТ"));
        System.out.println("publishedSince:\n" + libraryAction.publishedSince(library, 2000));
    }
}
