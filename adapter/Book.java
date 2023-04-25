package adapter;

import java.util.ArrayList;
import java.util.Date;

public class Book implements Media {
    private String title;
    private String description;
    private Author author;
    private ArrayList<Review> reviews;

    public Book(String title, String aFirstName, String aLastName, String description) {
        this.title = title;
        this.description = description;
        author = new Author(aFirstName, aLastName);
        reviews = new ArrayList<Review>();
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public void addReview(String firstName, String lastName, Date date, double rating, String comment) {
        reviews.add(new Review(firstName, lastName, date, rating, comment));
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

}
