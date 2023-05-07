public class Main {
    public static void main(String[] args) {
        //Creation of book and library objects
        Book java = new Book("Y. Daniel Liang", "Introduction to Java programming", 9780133761313L, 2015, 400);
        Book stat = new Book("William Mendenhall III", "Introduction to probability and statistics", 9781133103752L, 2013, 60);
        Library virtualLib = new Library("Virtual E-Library");

        //Displaying book details
        System.out.println("Author:");
        System.out.println(java.author);
        System.out.println("\nTitle:");
        System.out.println(java.title);
        System.out.println("\nISBN:");
        System.out.println(java.isbn);
        System.out.println("\nPublication Year:");
        System.out.println(java.publicationYear);
        System.out.println("\nTotal copies");
        System.out.println(java.totalCopies);
        System.out.println("\nAvailable Copies:");
        System.out.println(java.availableCopies);

        //Adding the books to the library
        virtualLib.addBook(java);
        virtualLib.addBook(stat);

        //Checking that the library book is working
        System.out.println("\nBook title from library");
        System.out.println(virtualLib.listOfBooks.get(0).title);
        System.out.println("\nSecond book title from library:");
        System.out.println(virtualLib.listOfBooks.get(1).title);

        //Removing a book from the library
        virtualLib.removeBook(stat);

        System.out.println(Math.addExact(2, 3));

        //making sure that the book is gone
        //System.out.println(virtualLib.listOfBooks.get(1).title); // => Throws an error

        //Code working perfectly.


    }
}