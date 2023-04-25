package adapter;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Review {
    private String firstName;
    private String lastName;
    private double rating;
    private Date date;
    private String comment;

    public Review(String firstName, String lastName, Date date, double rating, String comment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
        this.rating = rating;
        this.comment = comment;
    }

    public String toString() {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("M/d/y");
        String formattedDate = dateFormatter.format(date);
        return rating + " stars - " + comment + " by " + firstName + " " + lastName + " on " + formattedDate;
    }
}
