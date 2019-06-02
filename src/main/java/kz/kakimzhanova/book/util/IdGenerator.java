package kz.kakimzhanova.book.util;

public class IdGenerator {
    private static long bookId = 1;
    private static long libraryId = 1;

    public static long generateBookId(){
        return bookId++;
    }

    public static long generateLibraryId(){
        return libraryId++;
    }
}
