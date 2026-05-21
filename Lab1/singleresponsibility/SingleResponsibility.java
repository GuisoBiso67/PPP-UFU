package singleresponsibility;

import singleresponsibility.correct.BookInfo;

public class SingleResponsibility {

    public SingleResponsibility() {
       doCorrectImplementation();
    }

    public void doIncorrectImplementation() {
        /**
         * Considere uma classe que contenha informações sobre um livro.
         * A única função dessa classe deve ser conter dados relacionados a livros 
         * e operações relacionadas a livros. 
         */
        singleresponsibility.incorrect.Book book = new singleresponsibility.incorrect.Book("Clean Architecture", "Robert Martin", "Science");
        /**
         * Ter um método que imprime o nome do autor nessa classe viola 
         * o Princípio da Responsabilidade Única (por que?)
         */
        book.printAuthorName();
    }
    public void doCorrectImplementation() {
        singleresponsibility.correct.Book book = new singleresponsibility.correct.Book("Darkly Dreaming Dexter", "Jeff Linday", "Policial");
        BookInfo book1Info = new BookInfo(book);
        book1Info.printTitle();
        book1Info.printAuthor();
        book1Info.printGenre();
    }
    
    public static void main(String [] args ) {
        SingleResponsibility sr = new SingleResponsibility();
    }
        
}
