package kz.kakimzhanova.book.entity;

import java.math.BigDecimal;

public class Book {
    private static int bookCount = 0;
    private int bookId;
    private String name;
    private String[] authors;
    private String publishingHouse;
    private int publishingYear;
    private int pagesQuantity;
    private BigDecimal price;
    private String bindingType;

    public Book(String name, String[] authors,
                String publishingHouse, int publishingYear,
                int pagesQuantity, double price, String bindingType){

        this.bookId = ++bookCount;
        this.name = name;
        this.authors = authors;
        this.publishingHouse = publishingHouse;
        this.publishingYear = publishingYear;
        this.pagesQuantity = pagesQuantity;
        this.price = BigDecimal.valueOf(price);
        this.bindingType = bindingType;
    }

    public Book(String name, String author,
                String publishingHouse, int publishingYear,
                int pagesQuantity, double price, String bindingType){
        String[] newAuthors = {author};

        this.bookId = ++bookCount;
        this.name = name;
        this.authors = newAuthors;
        this.publishingHouse = publishingHouse;
        this.publishingYear = publishingYear;
        this.pagesQuantity = pagesQuantity;
        this.price = BigDecimal.valueOf(price);
        this.bindingType = bindingType;
    }

    public String[] getAuthors(){
        return authors;
    }

    public String getPublishingHouse(){
        return publishingHouse;
    }

    public int getPublishingYear(){
        return publishingYear;
    }
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(bookId);
        s.append(" ");
        s.append(name);
        s.append(" ");
        for (String author : authors){
            s.append(author);
            s.append(" ");
        }
        s.append("\n");
        s.append("Издательство: '");
        s.append(publishingHouse);
        s.append("' ,");
        s.append(publishingYear);
        s.append("г. ");
        s.append(pagesQuantity);
        s.append("c. ");
        s.append(price);
        s.append("тг. ");
        s.append(bindingType);
        s.append(" переплет\n");
        return s.toString();
    }
}
