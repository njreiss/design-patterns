package adapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Library {
    private ArrayList<Media> media;

    public Library() {
        media = new ArrayList<Media>();
    }

    /**
     * Creates two books, adds reviews and displays them
     */
    public void run() {
        // Adding first book
        Media book1 = new Book("How Beautiful We were", "Imbolo", "Mbue",
                "A fearless young woman from a small African village starts a revolution against an American oil company in this sweeping, inspiring novel from the New York Times bestselling author of Behold the Dreamers.");
        book1.addReview("Amy", "Smith", parseDate("2021-07-15"), 4.5, "What a beautiful story");
        book1.addReview("Bob", "White", parseDate("2021-10-09"), 5, "The authors passion is clear!");
        book1.addReview("Carl", "Carleson", parseDate("2022-02-22"), 4.8, "My new favorite book");

        media.add(book1);

        // Adding second book
        LittleMedia book2 = new LittleBook("Intimacies", "Katie Kitamura",
                "An interpreter has come to The Hague to escape New York and work at the International Court. A woman of many languages and identities, she is looking for a place to finally call home.");
        book2.addReview("Jamie Appleton", parseDate("2021-02-24"), 3, "It was so exciting.");
        book2.addReview("Samantha Jamieson", parseDate("2021-04-14"), 4, "I really liked this book.");

        media.add(new MediaAdapter(book2));
        media.get(1).addReview("Lydia", "Long", parseDate("2022-01-11"), 4.8, "Just Wow!");

        // loop through and display media
        for (Media book : media) {
            System.out.println("\n*****" + book.getTitle() + " by " + book.getAuthor() + "*****");
            System.out.println(book.getDescription());
            System.out.println("Reviews: ");
            for (Review review : book.getReviews()) {
                System.out.println(review);
            }

        }
    }

    /**
     * Converts a string date in the format yyyy-mm-dd to a java date
     * 
     * @param date The string formatted date
     * @return The new date or null if the string is in the incorrect format
     */
    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.run();
    }
}