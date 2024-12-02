import java.util.Scanner;

class Book {
    private String name;
    private String author;
    private int price;
    private int numPages;

    public Book(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public String toString() {
        return "Book name: " + this.name + "\n" +
               "Author name: " + this.author + "\n" +
               "Price: " + this.price + "\n" +
               "Number of pages: " + this.numPages + "\n";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the number of books: ");
        int n = Integer.parseInt(s.nextLine()); 

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = s.nextLine(); 
            System.out.print("Author: ");
            String author = s.nextLine(); 
            System.out.print("Price: ");
            int price = Integer.parseInt(s.nextLine()); 
            System.out.print("Number of pages: ");
            int numPages = Integer.parseInt(s.nextLine()); 

            books[i] = new Book(name, author, price, numPages);
        }

        System.out.println("\nBook Details:");
        for (int i = 0; i < n; i++) {
            System.out.println(books[i].toString());
        }
        
        s.close(); 
    }
}

