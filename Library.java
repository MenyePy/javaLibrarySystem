import java.util.*;
public class Library {
    //Initializing Variables
    String name;
    ArrayList<Book> listOfBooks;

    //Creating constructor method

    Library(String name){
        this.name = name;
        this.listOfBooks =  new ArrayList<Book>();
    }

    //Creating the addBook method, which adds a book to the list of books in the library
    void addBook(Book book){
        this.listOfBooks.add(book);
    }

    //Creating the addBook method, which removes a book from the list of books in the library
    void removeBook(Book book){
        this.listOfBooks.remove(book);
    }
}
