package adapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class LittleBook implements LittleMedia {
    private String title;
    private String author;
    private String description;
    private ArrayList<String> reviews;

    public LittleBook(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;
        reviews = new ArrayList();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public void addReview(String userName, Date date, int rating, String comment) {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");
        String formattedDate = dateFormatter.format(date);
        reviews.add(rating + " stars - " + comment + " by " + userName + " - " + formattedDate);
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }
}
