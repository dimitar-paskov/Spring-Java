import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class EP24BookLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Book> books = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");
            String title = tokens[0];
            String author = tokens[1];
            String publisher = tokens[2];
            LocalDate releaseDate = LocalDate.parse(tokens[3], formatter);
            String ISBN = tokens[4];
            double price = Double.parseDouble(tokens[5]);
            Book newBook = new Book(title, author, publisher, releaseDate, ISBN, price);
            books.add(newBook);

        }


        Library library = new Library (books);

        TreeMap<String, Double> authorsIncome = new TreeMap<>();
        for (Book book:library.books
             ) {
            if (authorsIncome.containsKey(book.author)){
            authorsIncome.put(book.author,authorsIncome.get(book.author) + book.price );

            }else{
                authorsIncome.put(book.author, book.price);
            }
        }

      //  Comparator<Map.Entry<String, Double>> comparator = Map.Entry.<String, Double>comparingByValue().reversed();

        authorsIncome.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(x-> System.out.printf("%s -> %.2f%n", x.getKey(), x.getValue()));



    }
}

class Book{
    String title;
    String author;
    String publisher;
    LocalDate releaseDate;
    String ISBN;
    double price;

    public Book(String title, String author, String publisher, LocalDate releaseDate, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
        this.ISBN = ISBN;
        this.price = price;
    }


}

class Library{
    String name;
    ArrayList<Book> books;

    public Library(String name, ArrayList<Book> books) {
        this.name = name;
        this.books = books;
    }

    public Library(ArrayList<Book> books) {
       this.name = "MyLibrary";
       this.books = books;
    }


}
