package Tasks;

public class Task11 {
    public static void main(String[] args) {
        Book[] books = new Book[] {
            new Book ("Java Programming", "John Smith", 2021, 39.99),
            new Book ("Python Basics", "Jane Doe", 2020, 29.99),
            new Book ("C++ Essentials", "Michael Johnson", 2019, 49.99)
        };

        int bookNumber = 1; 
        for (Book book : books) { 
            System.out.println("Book " + bookNumber + ":"); 
            System.out.println(book); 
            System.out.println(); 
            bookNumber++; }

    }
}
class Book {
    String title;
    String author;
    int yearPublished;
    double price;
    public Book(String title, String author, int yearPublished, double price){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    @Override 
    public String toString() { 
        return String.format( "Title: \"%s\"%n" + "Author: \"%s\"%n" + "Year Published: %d%n" + "Price: $%.2f",title, author, yearPublished, price ); 
    }
}