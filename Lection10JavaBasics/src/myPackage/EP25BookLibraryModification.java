package myPackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class EP25BookLibraryModification {

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
            String input  = scanner.nextLine();
            LocalDate limitDate = LocalDate.parse(input, formatter);


            Library library = new Library(books);



            Comparator<Book> comparator = Comparator.comparing(Book::getReleaseDate);
            comparator = comparator.thenComparing(Comparator.comparing(Book::getTitle));

            library.books.stream()
                    .filter(x->x.releaseDate.isAfter(limitDate))
                    .sorted(comparator)
                    .forEach(x->
                            System.out.printf("%s -> %s%n", x.getTitle(),
                                    x.getReleaseDate().format(formatter)));


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

        public String getTitle() {
            return title;
        }

        public LocalDate getReleaseDate() {
            return releaseDate;
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



