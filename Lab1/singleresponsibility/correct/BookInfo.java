package singleresponsibility.correct;

public class BookInfo {
    Book book;
    public BookInfo(Book book) {
        this.book = book;
    }

    public void printTitle() {
        System.out.println("Title: " + book.getTitle());
    }
    public void  printAuthor() {
        System.out.println("Author: " + book.getAuthor());
    }
    public void printGenre() {
        System.out.println("Genre: " + book.getGenre());
    }
}
