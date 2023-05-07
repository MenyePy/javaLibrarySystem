public class Book {
    //Initializing the variables
    String author;
    String title;
    long isbn;
    int publicationYear;
    int availableCopies;
    int totalCopies;

    //Creation of constructor method

    Book(String author, String title, long isbn, int publicationYear, int totalCopies){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
    }
}
